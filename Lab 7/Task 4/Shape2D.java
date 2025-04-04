public class Shape2D {
    public int length;
    public int width;
    public int height;
    public int base;
    public int side1;
    public int side2;
    public int side3;
    public double area;

    public Shape2D(int length) {
        this.length = length;
        System.out.println("A square has been created with length: " + this.length);
    }

    public Shape2D(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("A rectangle has been created with length: " + this.length + " and breadth: " + this.width);
    }

    public Shape2D(int height, int base, String name) {
        this.height = height;
        this.base = base;
        System.out.println("A triangle has been created with height: " + this.height + " and base: " + this.base);
    }

    public Shape2D(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        System.out.println("A triangle has been created with sides: " + side1 + ", " + side2 + ", " + side3);
    }

    public void area() {
        if (this.length != 0 && this.width == 0) {
            this.area = this.length * this.length;
            System.out.println("The area of the Square is: " + this.area);
        } else if (this.length != 0 && this.width != 0) {
            this.area = this.length * this.width;
            System.out.println("The area of the Rectangle is: " + this.area);
        } else if (this.height != 0 && this.base != 0) {
            this.area = 0.5 * this.base * this.height;
            System.out.println("The area of the Triangle is: " + this.area);
        } else if (this.side1 != 0 && this.side2 != 0 && this.side3 != 0) {
            double s = (this.side1 + this.side2 + this.side3) / 2;
            this.area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
            System.out.println("The area of the Triangle is: " + String.format("%.2f", this.area));
        }
    }
}