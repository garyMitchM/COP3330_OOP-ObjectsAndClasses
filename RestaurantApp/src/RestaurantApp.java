//Gary Montero COP3330C Object-Oriented Programming Aug 26, 2024
//Module 1 | Classes & Objects | Programming Project
//Restaurant App includes two restaurants that are able to manage orders, revenue, or inventory.
//Dave's Hot Chicken requires an order number, the kind of entrée, the heat level, and the price
//Chipotle requires the type of meal, the inventory of bowls and tortillas, the kind of meat, and the guacamole price
public class RestaurantApp {
    public static void main(String[] args) {
        //instantiating objects
        DavesHotChicken davesHotChicken01 = new DavesHotChicken();
        Chipotle chipotle01 = new Chipotle("null", 500, 500, "null", 2.50);

        //using methods
        davesHotChicken01.defaultValues();

        //Making Dave's Hot Chicken Orders
        davesHotChicken01.davesHotChickenOrder(1, "Slider", "hot", 6.99);
        davesHotChicken01.davesHotChickenOrder(2, "tender", "medium", 4.99);
        davesHotChicken01.davesHotChickenOrder(3, "Slider", "extra hot", 6.99);
        davesHotChicken01.davesHotChickenOrder(4, "Bites", "hot", 4.50);
        davesHotChicken01.davesHotChickenOrder(5, "slider", "mild", 6.99);

        //Displaying the total daily revenue
        davesHotChicken01.totalDailyRevenue();

        //Setting the total daily revenue back to 0.00
        davesHotChicken01.setDailyRevenue(0);

        davesHotChicken01.totalDailyRevenue();


        //displaying recent info
        chipotle01.displayRecentInfo();

        //Making Chipotle orders
        chipotle01.chipotleOrder("bowl", "chicken");
        chipotle01.displayChipOrderInfo();
        chipotle01.displayRecentInfo();
        chipotle01.chipotleOrder("burrito", "steak");
        chipotle01.displayChipOrderInfo();
        chipotle01.displayRecentInfo();
        chipotle01.chipotleOrder("taco", "chicken");
        chipotle01.displayChipOrderInfo();
        chipotle01.displayRecentInfo();
        chipotle01.chipotleOrder("salad", "none");
        chipotle01.displayChipOrderInfo();
        chipotle01.displayRecentInfo();
        //Adding to the inventory
        chipotle01.addToInv(100,100);
        chipotle01.displayInvInfo();

        //Setting the guacamole price
        chipotle01.setGuacamolePrice(1.99);
        chipotle01.displayRecentInfo();

        System.out.println("The guacamole price is currently set to: " + chipotle01.getGuacamolePrice());

    }
}
