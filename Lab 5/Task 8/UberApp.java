public class UberApp {
    public String name;
    public int age;
    public String contact;
    public int remainingRides;
    public double fare;
    public String[] locationHistory = new String[3];
    public String tempLocation;

    public void newUberApp() {
        this.name = null;
        this.age = 0;
        this.contact = null;
        this.remainingRides = 0;
    }

    public void createProfile(String name, int age, String contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.remainingRides = 3;
    }

    public void showProfile() {
        System.out.println("Hello! This is your Profile:");
        System.out.println("Full Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Phone Number: " + this.contact);
    }

    public int remainingRides() {
        return this.remainingRides;
    }

    public void bookRide(String location, double distance) {
        this.tempLocation = location;
        if (this.remainingRides > 0) {
            System.out.println(this.name + " has booked a ride!");
            System.out.println("Destination: " + location);
            this.fare = 30.0 * distance;
            System.out.println("Fare: " + this.fare + " Taka");
        }
        if (this.remainingRides > 0) {
            for (int i = 0; i <= 2; i++) {
                if (this.locationHistory[i] == null) {
                    this.locationHistory[i] = location;
                    break;
                }
            }
        } else {
            System.out.println(this.name + ", please update your plan to premium or wait till next month!");
        }
        this.remainingRides--;
    }

    public void changeLocation(String location, double distance) {
        this.fare = 30.0 * distance;
        System.out.println(this.name + " has changed the destination of his current ride to " + location);
        this.fare = this.fare + (this.fare * .2);
        System.out.println("New fare after adding 20% change fees: " + this.fare + " Taka");
        for (int i = 0; i <= 2; i++) {
            if (this.tempLocation == this.locationHistory[i]) {
                this.locationHistory[i] = location;
            }
        }
    }

    public void ridingHistory() {
        String location1 = this.locationHistory[0];
        String location2 = this.locationHistory[1];
        String location3 = this.locationHistory[2];
        if (location1 != null && location2 == null && location3 == null) {
            System.out.println(this.name + ", you have visited " + location1 + " this month.");
        } else if (location3 == null && location1 != null && location2 != null) {
            System.out.println(this.name + ", you have visited " + location1 + ", " + location2 + " this month.");
        } else {
            System.out.println(this.name + ", You haven't visited anywhere this month.");
        }
    }

    public void resetMonth() {
        this.remainingRides = 3;
        for (int i = 0; i <= 2; i++) {
            this.locationHistory[i] = null;
        }
    }
}