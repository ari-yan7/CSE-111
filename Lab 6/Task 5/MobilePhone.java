public class MobilePhone {
    public int capacity;
    public String[] names;
    public int[] numbers;
    public int contacts = 0;

    public MobilePhone() {
        this.contacts = 0;
    }

    public void setContactCapacity(int capacity) {
        this.capacity = capacity;
        this.names = new String[this.capacity];
        this.numbers = new int[this.capacity];
    }

    public void addContact(String name, int num) {
        for (int i = 0; i < this.capacity; i++) {
            if (names[i] == null) {
                names[i] = name;
                numbers[i] = num;
                this.contacts++;
                System.out.println("The contact of " + name + " is added.");
                break;
            } else if (i == this.capacity - 1) {
                System.out.println("Storage full!!");
                break;
            }
        }
    }

    public void details() {
        System.out.println("Total Contacts: " + this.contacts);
        System.out.println("Contact List:");
        for (int i = 0; i < this.contacts; i++) {
            System.out.println(names[i] + ": " + numbers[i]);
        }
    }

    public void makeCall(int num) {
        boolean found = false;
        for (int i = 0; i < this.capacity; i++) {
            if (numbers[i] == num) {
                System.out.println("Calling " + names[i] + " . . .");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Calling " + num + " . . .");
        }
    }
}