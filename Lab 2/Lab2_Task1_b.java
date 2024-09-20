/*  Using while loops, write a java code to display/print the following serieses:
 (b) 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 105, 120
 (Hint: at each iteration, the increment amount also increases)
*/

public class Lab2_Task1_b
{
    public static void main (String[]args)
    {
        int start = 1;
        int end = 120;
        int i = 2;
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
            start+=i;
            i = i+1;
        }
    }
}