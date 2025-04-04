public class Circle extends Shape {
    public double radius;

    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of " + color + " " + name + ": " + area);
    }
}