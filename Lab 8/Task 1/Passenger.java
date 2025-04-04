public class Passenger {
    public static int no_of_passenger = 0;
    public static double total_fare = 0.0;
    public String name;
    public double fare;
    public double baggageweight;

    public Passenger(String name, double distance) {
        this.name = name;
        this.fare = (20 * distance);
        no_of_passenger++;
        total_fare += this.fare;
    }

    public void passengerDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Fare: " + this.fare);
    }

    public void setBaggageWeight(double baggageweight) {
        this.baggageweight = (10 * baggageweight);
        this.fare += this.baggageweight;
        total_fare += this.baggageweight;
    }
}