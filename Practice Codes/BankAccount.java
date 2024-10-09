public class BankAccount {
    public String name = null;
    public String number = null;
    public String type = null;
    public int openingbalance = 0;
    public int depositamount = 0;
    public int withdrawalamount = 0;
    public int balance = 0;

    public void createAccount(String name, String number, String type, int openingbalance) {
        this.name = name;
        this.number = number;
        this.type = type;
        this.openingbalance = openingbalance;
        if (this.openingbalance < 20000 && this.type == "current") {
            System.out.println("Sorry " + this.name + " could not create a " + this.type + " account");
            System.out.println("Minimum amount must be BDT20000");
            System.out.println();
        } else {
            System.out.println(this.name + " " + this.type + " account creation successful");
            System.out.println("Your " + this.type + " balance is " + this.openingbalance);
            this.balance += this.openingbalance;
            System.out.println();
        }
    }

    public void deposit(String name, String number, int depositamount) {
        this.name = name;
        this.number = number;
        this.depositamount = depositamount;
    }

    public void withdraw(String number, String name, int withdrawalamount) {
        // this.withdrawalamount = withdrawalamount;
        if (name != this.name && number != this.number) {
            System.out.println("Unsuccessful. Your name-account number mismatch");
        } else {
            if (this.balance < withdrawalamount) {
                System.out.println("Unsuccessful. Withdrawl amount exceeds your balance");
            } else {
                this.balance = this.balance - withdrawalamount;
                if (this.balance < 10000) {
                    System.out.println("Unsuccessful. The minimum balance after withdrawl must be greater than 10000");
                    this.balance = this.balance + withdrawalamount;
                } else {
                    System.out.println("Withdrawl Successful. Your current balance is " + this.balance);
                }
            }
        }
    }

    public void printStatement() {

    }
}