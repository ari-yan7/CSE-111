class Driver {
    public static void main(String[] args) {
        System.out.println("Welcome to ABC Bank \n");

        BankAccount ba[] = new BankAccount[4];
        String clients[] = { "Frodo", "current", "20000", "Sauron", "savings", "5000",
                "Aragon", "savings", "30000", "Gandalf", "current", "2000" };

        int j = 0, k = 0;
        while (j < 4) {
            ba[j] = new BankAccount();
            ba[j].createAccount(clients[k], String.valueOf(j),
                    clients[k + 1], Integer.parseInt(clients[k + 2]));
            j++;
            k = k + 3;
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        ba[0].withdraw("1", "Frodo", 2222);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        ba[0].withdraw("0", "Frodo", 2000000);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        ba[0].withdraw("0", "Frodo", 12000);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        ba[0].withdraw("0", "Frodo", 9000);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        ba[0].withdraw("0", "Frodo", 1000);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        ba[0].deposit("0", "Frodo", 2000);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        ba[0].printStatement();
    }
}