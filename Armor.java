public class Armor extends Item {
    private int protection; 
    private String type;

      public Armor(String name, int quantity, int protection, String type) {
        super(name, quantity);
        this.protection = protection;
        this.type = type;
        }

        public int getProtection() {
            return protection;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return "Weapon: " + getName() + ", Quantity: " + getQuantity() + ", Protection: " + getProtection() + ", Type: " + type;  
        }
}


