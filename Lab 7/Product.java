public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
        this.name = "Unknown";
        this.price = 0.0;
        this.quantity = 0;
    }

    public void displayInfo() {
        System.out.println("Product Name: " + this.name);
        System.out.println("Price: $" + this.price);
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void displayInfo(boolean quantity) {
        System.out.println("Product Name: " + this.name);
        System.out.println("Price: $" + this.price);
        if (quantity) {
            System.out.println("Quantity: " + this.quantity);
        }
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }
}