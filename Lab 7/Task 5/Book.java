public class Book {
    public String title;
    public String author;
    public int price;

    public Book(String name) {
        this.title = name;
    }

    public void displayDetails() {
        if (this.title != null && this.author == null && this.price == 0) {
            System.out.println("Title: " + this.title);
        }
        if (this.author != null && this.title != null && this.price == 0) {
            System.out.println("Title: " + this.title + ", Author: " + this.author);
        }
        if (this.price != 0 && this.author != null && this.price != 0) {
            System.out.println("Title: " + this.title + ", Author: " + this.author + ", Price: " + this.price);
        }
        if (this.price != 0 && this.title != null && this.author == null) {
            System.out.println("Title: " + this.title + ", Price: " + this.price);
        }
    }

    public Book(String name, String author) {
        this.title = name;
        this.author = author;
    }

    public Book(String name, String author, int price) {
        this.title = name;
        this.author = author;
        this.price = price;
    }

    public void setDetails(int price) {
        this.price = price;
    }

    public void setDetails(String author, int price) {
        this.author = author;
        this.price = price;
    }
}