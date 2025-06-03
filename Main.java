public class Main {
    public static void main (String[] args) {

        Inventory inventory = new Inventory(); 

        Ration mreRation = new Ration("MRE", 10, 25);
        Weapon axeWeapon = new Weapon("Axe", 4, 75, "Melee");
        Weapon daggarWeapon = new Weapon("Axe", 4, 75, "Melee");
        Armor chainmillArmor = new Armor("Chainmill", 1, 90, "body");

        inventory.addItem(mreRation);
        inventory.addItem(axeWeapon);
        inventory.addItem(daggarWeapon);
        inventory.addItem(chainmillArmor);

        inventory.displayInventory();
    }

}
