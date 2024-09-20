public class Test3
{
  public static void main(String [] args)
  {
    Circle r = new Circle();
    System.out.println("Radius of the circle is "+r.radius);
    double area = Math.PI*(r.radius*r.radius);
    System.out.println("The area of the circle is "+area);
    double circumference = 2*Math.PI*r.radius;
    System.out.println("The circumference of the circle is "+circumference);
  }
}