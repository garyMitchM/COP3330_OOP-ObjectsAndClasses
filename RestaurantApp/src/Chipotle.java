// Represents a single Chipotle location. This location can take orders,
// update its inventory info,
//and set the guacamole price.

public class Chipotle {
    //Attributes
    private String orderTypeChip;
    private int inventoryOfBowls;
    private int inventoryOfTortillas;
    private String kindOfMeat;
    private double guacamolePrice;

    //Constructor
    public Chipotle(String orderTypeChip, int inventoryOfBowls, int inventoryOfTortillas, String kindOfMeat, double guacamolePrice) {
        this.orderTypeChip = orderTypeChip;
        this.inventoryOfBowls = inventoryOfBowls;
        this.inventoryOfTortillas = inventoryOfTortillas;
        this.kindOfMeat = kindOfMeat;
        this.guacamolePrice = guacamolePrice;
    }

    //Overloaded Constructor
    //All values set to 0 or null
    public Chipotle() {
        this.orderTypeChip = "null";
        this.inventoryOfBowls = 0;
        this.inventoryOfTortillas = 0;
        this.kindOfMeat = "null";
        this.guacamolePrice = 0.0;
    }

    //Getters
    //Returns the corresponding field's data type
    public String getOrderTypeChip() {
       return orderTypeChip;
    }

    public int getInventoryOfBowls() {
        return inventoryOfBowls;
    }

    public int getInventoryOfTortillas() {
        return inventoryOfTortillas;
    }

    public String getKindOfMeat() {
        return kindOfMeat;
    }

    public double getGuacamolePrice() {
        return guacamolePrice;
    }

    //Setters
    //Sets the corresponding field set by the user
    //Return value: void
    public void setOrderTypeChip(String orderTypeChip) {
        this.orderTypeChip = orderTypeChip;
    }

    public void setInventoryOfBowls(int inventoryOfBowls) {
        this.inventoryOfBowls = inventoryOfBowls;
    }

    public void setInventoryOfTortillas(int inventoryOfTortillas) {
        this.inventoryOfTortillas = inventoryOfTortillas;
    }

    public void setKindOfMeat(String kindOfMeat) {
        this.kindOfMeat = kindOfMeat;
    }

    public void setGuacamolePrice(double guacamolePrice) {
        this.guacamolePrice = guacamolePrice;
    }


    //print method: displays the most recent Chipotle order and inventory info
    //Return value: void
    public void displayRecentInfo() {
        System.out.println("Type of Order: " + orderTypeChip +
                        "\nNumber of bowls left: " + inventoryOfBowls +
                        "\nNumber of Tortillas left: " + inventoryOfTortillas +
                        "\nKind of Meat: " + kindOfMeat +
                        "\nGuacamole price: " + guacamolePrice +
                        "\n");
    }

    //Custom method: Add to inventory
    //Adds additional bowls and tortillas to inventory
    //Expects the number of bowls/tortillas as arguments
    //Return value: void
    public void addToInv(int numberOfBowls, int numberOfTortillas) {
        this.inventoryOfBowls += numberOfBowls;
        this.inventoryOfTortillas += numberOfTortillas;
        System.out.println(numberOfBowls + " bowls and " + numberOfTortillas + " tortillas were added to the inventory.\n" );
    }

    //print method: displays the current Chipotle bowl/tortilla inventory
    //Return value: void
    public void displayInvInfo() {
        System.out.println("Number of bowls left: " + inventoryOfBowls +"\nNumber of Tortillas left: " + inventoryOfTortillas + "\n");
    }

    //Custom method: Takes an order and changes the number of bowls or tortillas that are left for the day.
    //Expects the order type and the kind of meat as arguments
    //Return value: void
    public void chipotleOrder(String orderTypeChip, String kindOfMeat) {
        this.orderTypeChip = orderTypeChip;
        if (this.orderTypeChip.equals("taco") || this.orderTypeChip.equals("burrito")) {
            this.inventoryOfTortillas--; //If the order is taco or burrito subtract one tortilla from the # of tortillas left in inventory
        }

        this.kindOfMeat = kindOfMeat;
        if (this.orderTypeChip.equals("bowl") || this.orderTypeChip.equals("salad")) {
            this.inventoryOfBowls--; //If the order is bowl or salad subtract one bowl from the # of bowls left in inventory
        }

    }

    //print method: displays the order type and how many bowl/tortillas are left
    //Return value: void
    public void displayChipOrderInfo() {
        if(this.orderTypeChip.equals("taco") || this.orderTypeChip.equals("burrito")) {
            System.out.println("This order was a " + this.orderTypeChip + " with " + kindOfMeat + ". " + "There are now " + inventoryOfTortillas + " tortillas left.\n");
        }
        if(this.orderTypeChip.equals("bowl") || this.orderTypeChip.equals("salad")) {
            System.out.println("This order was a " + this.orderTypeChip + " with " + kindOfMeat + ". " + "There are now " + inventoryOfBowls + " bowls left.\n");
        }
    }
}
