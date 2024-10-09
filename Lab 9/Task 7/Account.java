public class Account {
    public static int count = 0;
    public String name;
    public int age;
    public String occupation;
    public int amount;

    public Account() {
        count++;
    }

    public Account(String name, int age, String occupation, int amount) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.amount = amount;
        count++;
    }

    public void addMoney(int money) {
        this.amount += money;
    }

    public void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Occupation: " + this.occupation);
        System.out.println("Total Amount: " + this.amount);
    }

    public void withdrawMoney(int money) {
        if (money > this.amount) {
            System.out.println("Insufficient money for withdrawal");
        } else if (money <= this.amount) {
            this.amount -= money;
        }
    }
}