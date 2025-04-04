public class Book {
    public static int total_books_sold;
    public static double total_revenue;
    public String title;
    public double price = 150;

    public Book(String title, int percentage) {
        this.title = title;
        double discount = (double) percentage / 100;
        this.price = this.price - (this.price * discount);
        total_books_sold++;
        total_revenue += this.price;
    }

    public void bookDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Price after discount: " + this.price + " TK");
    }
}