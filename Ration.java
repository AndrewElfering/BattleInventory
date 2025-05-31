public class Ration extends Item {
    private String type;

    public Ration(String name, int quantity, String type) {
        super(name, quantity);
        this.type = type; 
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
      return "Ration: " + getName() + ", Quantity: " + getQuantity() + ", Type: " + type;  
    }
}
