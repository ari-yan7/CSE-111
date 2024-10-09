public class Cargo {
    public String contents;
    public double weight;
    public boolean loaded = false;
    public int id;
    public static int idcount;
    public static double capacity = 10.0;

    public static double capacity() {
        return capacity;
    }

    public Cargo(String contents, double weight) {
        this.contents = contents;
        this.weight = weight;
        idcount++;
        this.id = idcount;
    }

    public void details() {
        System.out.println("Cargo ID: " + this.id + ", Contents: " + this.contents + ", Weight: " + this.weight
                + ", Loaded: " + this.loaded);
    }

    public void load() {
        if (capacity>=this.weight){
            this.loaded = true;
            capacity-=this.weight;
            System.out.println("Cargo " + this.id + " loaded for transport.");
        }
        else {
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }
    }

    public void unload() {
        capacity += this.weight;
        this.loaded = false;
        System.out.println("Cargo " + this.id + " unloaded.");
    }
}