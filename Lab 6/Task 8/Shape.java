public class Shape {
    public String name;
    public double area;

    public void setParameters(String name, int radius) {
        this.area = Math.PI * radius * radius;
        this.name = name;
    }

    public void setParameters(String name, int base, int height) {
        this.area = 0.5 * base * height;
        this.name = name;
    }

    public void setParameters(String name, int length1, int length2, int height) {
        this.area = 0.5 * (length1 + length2) * height;
        this.name = name;
    }

    public String details() {
        return "Shape Name: " + this.name + "\nArea: " + String.format("%.2f", this.area);
    }
}