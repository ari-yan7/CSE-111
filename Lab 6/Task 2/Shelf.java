public class Shelf {
    public int capacity;
    public int books;

    public void showDetails() {
        System.out.println("Shelf Capacity: " + this.capacity);
        System.out.println("Number of Books: " + this.books);
    }

    public void addBooks(int bookNum) {
        if (this.capacity == 0) {
            System.out.println("Zero capacity. Cannot add books.");
        } else if (this.capacity > 0) {
            this.books += bookNum;
            if (this.books < this.capacity) {
                System.out.println(bookNum + " books added to shelf");
            } else {
                System.out.println("Exceeds capacity");
                this.books -= bookNum;
            }
        }
    }
}