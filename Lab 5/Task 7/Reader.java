public class Reader {
    public String name;
    public int capacity;
    public String[] books = new String[0];
    public boolean added = false;
    public String[] temp = new String[0];
    public int printcount = 0;

    public void newReader() {
        this.name = null;
        this.books = null;
    }

    public void createReader(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        books = new String[this.capacity];
        temp = new String[this.capacity + 1];
    }

    public void readerInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Books: ");
        if (!this.added) {
            System.out.println("No books added yet");
        } else {
            for (int i = 0; i < this.capacity; i++) {
                System.out.println("Book " + (i + 1) + ": " + this.books[i]);
                this.printcount++;
                if (this.printcount == 3) {
                    break;
                }
            }
        }
    }

    public void addBook(String book) {
        this.added = true;
        for (int i = 0; i <= this.capacity; i++) {
            if (i < this.capacity) {
                if (this.books[i] == null) {
                    this.books[i] = book;
                    this.temp[i] = book;
                    break;
                }
            } else if (i == this.capacity) {
                this.temp[i] = book;
                System.out.println("No more space for new book");
                break;
            }
        }
    }

    public void increaseCapacity(int newcapacity) {
        this.capacity = newcapacity;
        books = new String[this.capacity];
        for (int i = 0; i < this.temp.length; i++) {
            books[i] = temp[i];
            temp[i] = null;
            if (temp[this.temp.length - 1] == null) {
                break;
            }
        }
        temp = new String[this.capacity];
        System.out.println(this.name + "'s capacity increased to " + this.capacity);
    }
}