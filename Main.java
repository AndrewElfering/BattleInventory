public class Main {
    public static void main (String[] args) {

        Inventory inventory = new Inventory(); 

        Item item1 = new Item("Generic Item", 10);
        Ration ration = new Ration("MRE", 10, "food");
        Weapon weapon = new Weapon("Axe", 4, 75, "bladed");

        inventory.addItem(item1);
        inventory.addItem(ration);
        inventory.addItem(weapon);
        inventory.displayInventory();
    }

}
