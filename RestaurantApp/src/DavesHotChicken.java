//Represents the order info at a Dave's Hot Chicken resturant
//First you set the order number, then you can select the kind of food the customer wants,
//select their heat level, and enter the price of their meal.

public class DavesHotChicken {
    //Attributes
    private int orderNumber;
    private String orderKindDaves;
    private String heatLevel;
    private double orderPrice;
    private double dailyRevenue;

    //Constructor
    public DavesHotChicken(int orderNumber, String orderKindDaves, String heatLevel, double orderPrice, double dailyRevenue) {
        this.orderNumber = orderNumber;
        this.orderKindDaves = orderKindDaves;
        this.heatLevel = heatLevel;
        this.orderPrice = orderPrice;
        this.dailyRevenue = dailyRevenue;
    }

    //Overloaded constructor
    //All values set to 0 or null
    public DavesHotChicken() {
        this.orderNumber = 0;
        this.orderKindDaves = "null";
        this.heatLevel = "null";
        this.orderPrice = 0.0;
        this.dailyRevenue = 0.0;
    }

    //Getters
    //Return Value: Returns the corresponding field's data type
    public int getOrderNumber() {
        return orderNumber;
    }

    public String getOrderKindDaves() {
        return orderKindDaves;
    }

    public String getHeatLevel() {
        return heatLevel;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public double getDailyRevenue() {
        return dailyRevenue;
    }

    //Setters
    //Sets the corresponding field set by the user
    //Return value: void
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setOrderKindDaves(String orderKindDaves) {
        this.orderKindDaves = orderKindDaves;
    }

    public void setHeatLevel(String heatLevel) {
        this.heatLevel = heatLevel;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public void setDailyRevenue(double dailyRevenue) {
        this.dailyRevenue = dailyRevenue;
    }

    //Print method: prints the default values
    //Return Value: void
    public void defaultValues() {
        System.out.println("Order number: " + orderNumber + "\nKind of order: " + orderKindDaves + "\nSelected Heat Level: " + heatLevel + "\nOrder Price: " + orderPrice + "\n");
    }


    //Custom method: displays the order information with a warning for "extra hot"
    // and adds the order price to the daily revenue.
    //expects the order number, order kind, heat level, and the order price as arguments
    //Return value: void
    public void davesHotChickenOrder(int orderNumber, String orderKindDaves, String heatLevel, double orderPrice) {
        this.orderNumber = orderNumber;
        this.orderKindDaves = orderKindDaves;
        this.heatLevel = heatLevel;
        this.orderPrice = orderPrice;
        System.out.println("Order number: " + orderNumber + "\nKind of order: " + orderKindDaves + "\nSelected Heat Level: " + heatLevel + "\nOrder Price: " + orderPrice);

        if(heatLevel.equals("extra hot")) { //If the heat level is "extra hot"
            System.out.println("Caution! This heat level is extremely hot!"); //displays warning for the "extra hot"
        }

        this.dailyRevenue += orderPrice; //Adds the price of the order to the total daily revenue.

    }

    //Print method: Prints the daily revenue
    //Returns value: void
    public void totalDailyRevenue () {
        System.out.println("Daily Total: " + this.dailyRevenue);

    }

}
