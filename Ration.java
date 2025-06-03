public class Ration extends Item {
    private int power;

    public Ration(String name, int quantity, int power) {
        super(name, quantity); 
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
      return "Ration: " + getName() + ", Quantity: " + getQuantity() + ", Power: " + getPower();  
    }
}
