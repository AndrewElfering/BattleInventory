public class Main {
    public static void main (String[] args) {

        Inventory inventory = new Inventory(); 

        Item item1 = new Item("Axe", 2);
        Item item2 = new Item("MRE", 20);

        inventory.addItem(item1);
        inventory.addItem(item2);

        inventory.displayInventory();

    }

}
