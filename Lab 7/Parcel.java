public class Parcel {
    public String name = "Set name first";
    public int weight;
    public double fee;

    public void printDetails() {
        if (this.name.equals("Set name first")) {
            System.out.println("Set name first");
        } else {
            System.out.println("Name: " + this.name);
            System.out.println("Total weight: " + this.weight);
            System.out.println("total fee: " + this.fee);
        }
    }

    public Parcel(String name) {
        this.name = name;
    }

    public Parcel() {

    }

    public Parcel(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void calcFee(String location) {
        if (this.weight >= 0) {
            if (location.equals("Dhanmondi")) {
                this.fee = (this.weight * 20) + 50.0;
            } else {
                this.fee = this.weight * 20;
            }
        } else {
            this.fee = 0.0;
        }
    }

    public void addWeight(int weight) {
        this.weight += weight;
        System.out.println("Updated weight: " + this.weight);
    }
}