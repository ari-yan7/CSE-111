public class CellPhone
{
  public String model = " unknown";
  public int count = 0;
  public String [] contacts = new String [4];
  public void storeContact(String contact)
  {
    if (count>=3)
    {
      System.out.println("Memory full. New contact can't be stored.");
    }
    else
    {
      System.out.println("Contact stored");
      contacts[count]=contact;
      count++;
    }
  }
  public void printDetails()
  {
    System.out.println("Phone model "+model);
    System.out.println("Contacts stored "+count);
    if (count!=0)
    {
      System.out.println("Stored Contacts: ");
    }
    for (int i = 0; i<count; i++)
    {
      System.out.println(contacts[i]);
    }
  }
}