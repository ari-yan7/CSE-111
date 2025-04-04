public class Bus {
    public int capacity;
    public String destination;

    public Bus(int capacity, String destination) {
        this.capacity = capacity;
        this.destination = destination;
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Destination: " + this.destination);
    }

    public void addPassenger(String p1, String destination) {
        if (this.capacity > 0 && this.destination == destination) {
            System.out.println(p1 + " has added to the bus.");
            this.capacity--;
        } else if (this.capacity > 0 && this.destination != destination) {
            System.out.println("Sorry " + p1 + "! The bus won't stop at " + destination);
            System.out.println("Use another bus.");
        } else if (this.capacity == 0) {
            System.out.println("Bus is full.");
        }
    }

    public void addPassenger(String p1) {
        if (this.capacity > 0) {
            System.out.println(p1 + " has added to the bus.");
            this.capacity--;
            System.out.println(p1 + " will get off at the last stop");
        }
    }
}