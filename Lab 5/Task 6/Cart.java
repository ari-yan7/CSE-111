public class Cart {
    public String[] items = new String[4];
    public double[] pieces = new double[4];
    public int count = 0;
    public double total = 0;
    public int cartnum;
    public boolean d = false;
    public double dis = 0.0;

    public void newCart() {
        this.items = null;
    }

    public void create_cart(int num) {
        this.cartnum = num;
    }

    public void addItem(String name, double price) {
        for (int i = 0; i <= 3; i++) {
            if (i < 3 && this.items[i] == null) {
                this.items[i] = name;
                this.pieces[i] = price;
                this.count++;
                this.total += price;
                System.out.println(name + " added to cart " + this.cartnum);
                System.out.println("You have " + this.count + " item(s) in your cart now.");
                break;
            } else if (i == 3) {
                System.out.println("You already have 3 items on your cart");
            }
        }

    }

    public void cartDetails() {
        System.out.println("Your cart(c" + this.cartnum + ") :");
        for (int i = 0; i <= 2; i++) {
            if (this.items[i] != null) {
                System.out.println(this.items[i] + " - " + this.pieces[i]);
            }
        }
        if (!this.d) {
            System.out.println("Discount Applied: " + this.dis + '%');
            System.out.println("Total price: " + this.total);
        } else {
            System.out.println("Discount Applied: " + this.dis + '%');
            System.out.println("Total price: " + this.total);
        }
    }

    public void giveDiscount(double discount) {
        this.d = true;
        this.dis = discount;
        double prod = discount / 100.0;
        this.total = this.total - (this.total * prod);
    }
}
