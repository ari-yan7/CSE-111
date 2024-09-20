/* Using while loops, write a java code to display/print the following serieses:
 (a) 2, 6, 10, 14, 18, 22, 26, 30, 34, 38, 42, 46, 50
 (Hint: Identify the start, end, and common increment)
*/

public class Lab2_Task1_a
{
    public static void main (String[]args)
    {
        int start = 2;
        int end = 50;
        while (start<=end)
        {
            if (start!=end)
            {
                System.out.print(start+", ");
            }
            else
            {
                System.out.print(start);
            }
            start+=4;
        }
    }
}