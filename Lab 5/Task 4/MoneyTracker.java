public class MoneyTracker {
    public String name;
    public double balance;
    public double lastIncome;
    public double lastExpense;

    public void newMoneyTracker() {
        this.name = "null";
        this.balance = 0.0;
    }

    public String info() {
        return "Name: " + name + "\nCurrent Balance: " + balance;
    }

    public void createTracker(String name) {
        this.name = name;
        this.balance = 1.0;
    }

    public void income(double income) {
        System.out.println("Balance Updated!");
        this.balance += income;
        this.lastIncome = income;
    }

    public void expense(double expense) {
        if (balance < expense) {
            System.out.println("Not enough balance.");
        } else {
            if ((this.balance - expense) == 0) {
                System.out.println("You're broke!");
            } else {
                this.balance -= expense;
                this.lastExpense = expense;
                System.out.println("Balance Updated.");
            }
        }
    }

    public void showHistory() {
        System.out.println("Last added: " + lastIncome);
        System.out.println("Last spent: " + lastExpense);
    }
}