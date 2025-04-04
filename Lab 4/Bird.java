public class Bird
{
  public String name;
  public int h;
  public void flyUp (int up)
  {
    h+=up;
    System.out.println(name+" has flown up "+up+" feet");
  }
  public void flyDown (int down)
  {
    if (h>down)
    {
      h-=down;
      System.out.println(name+" has flown down "+down+" feet");
    }
    else if (down>h)
    {
      System.out.println(name+" cannot fly down "+down+" feet");
    }
    else if (h==down)
    {
      System.out.println(name+" has flown down "+down+" feet and landed.");
    }
  }
  public void makeNoise()
  {
    if (name=="Parrot")
    {
      System.out.println("Squawk");
    }
    else if (name=="Eagle")
    {
      System.out.println("Squee");
    }
  }
}
