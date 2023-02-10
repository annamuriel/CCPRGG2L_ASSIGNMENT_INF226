public class App {
    public static void main(String[] args) throws Exception {
        GroceryItem item1 = new Diaper();
        item1.name = "Pampers";
        item1.showItemName();
        item1.price = 50;

        GroceryItem item2 = new Softdrink();
        item2.name = "Royal";
        item2.showItemName();
        item2.price = 65;

        Cashier c1 = new Cashier();

        c1.checkOut(item1);
        c1.checkOut(item2);

        c1.showItemPrice(item1);
        c1.showItemPrice(item2);

        GroceryItem[] itemArray = new GroceryItem[2];

        itemArray[0] = item1;
        itemArray[1] = item2;

        double totalAmount = 0.00;
        for (int i = 0; i < itemArray.length; i++) {
            itemArray[i].showItemName();
            totalAmount = totalAmount + itemArray[i].price;
            System.out.println(itemArray[i].price); 
        }

        System.out.println("The total is: " + totalAmount);

        Cat mycat = new Cat();
        mycat.eat();
    }
}
