public class ABCServer {
    public String servername = "Default";
    public int membercapacity = 10;
    public int totalmembers = 0;
    public String[] membernames = new String[membercapacity];
    public String[] memberroles = new String[membercapacity];

    public void details() {
        System.out.println("Server Name: " + this.servername);
        System.out.println("Member Capacity: " + this.membercapacity);
        System.out.println("Total Members: " + this.totalmembers);
        System.out.println("Members: ");
        if (this.totalmembers != 0) {
            for (int i = 0; i < this.totalmembers; i++) {
                System.out.println("Name:Role --> " + membernames[i] + ":" + memberroles[i]);
            }
        }
    }

    public ABCServer() {
        membernames = new String[membercapacity];
        memberroles = new String[membercapacity];
    }

    public ABCServer(String servername, int membercapacity) {
        this.servername = servername;
        this.membercapacity = membercapacity;
        membernames = new String[membercapacity];
        memberroles = new String[membercapacity];
    }

    public void addMembers(String membername) {
        if (this.totalmembers < this.membercapacity) {
            this.membernames[this.totalmembers] = membername;
            this.memberroles[this.totalmembers] = "Rising Hero";
            this.totalmembers++;
            System.out.println("Rising Hero is added.");
        } else {
            System.out.println("Sorry, maximum capacity exceed!");
        }
    }

    public void addMembers(String membername, String role) {
        if (this.totalmembers < this.membercapacity) {
            this.membernames[this.totalmembers] = membername;
            this.memberroles[this.totalmembers] = role;
            this.totalmembers++;
            System.out.println(role + " is added.");
        } else {
            System.out.println("Sorry, maximum capacity exceed!");
        }
    }
}