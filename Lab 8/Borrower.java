public class Borrower {
    public static int book_count[] = { 3, 3, 3 };
    public static String book_name[] = { "Pather Panchali", "Durgesh Nandini", "Anandmath" };
    public String name;
    public String borrowedBook[] = new String[3];

    public static void bookStatus() {
        System.out.println("Available Books:");
        for (int i = 0; i < book_count.length; i++) {
            System.out.println(book_name[i] + ": " + book_count[i]);
        }
    }

    public Borrower(String name) {
        this.name = name;
    }

    public void borrowBook(String book) {
        boolean found = false;
        for (int i = 0; i < book_name.length; i++) {
            if (book_name[i].equals(book)) {
                found = true;
                if (book_count[i] > 0) {
                    borrowedBook[i] = book;
                    book_count[i]--;
                    break;
                } else {
                    System.out.println("This book is not available.");
                    break;
                }
            }
        }
        if (!found){
            System.out.println("This book is not available.");
        }
    }

    public static int remainingBooks(String bookname) {
        for (int i = 0; i < book_name.length; i++) {
            if (book_name[i].equals(bookname)) {
                return book_count[i];
            }
        }
        return 0;
    }

    public void borrowerDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Books Borrowed: ");
        for (int i = 0; i < borrowedBook.length; i++) {
            if (borrowedBook[i] != null) {
                System.out.println(borrowedBook[i]);
            }
        }
    }
}