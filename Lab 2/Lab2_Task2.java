/*  Using for loop or while loop, write a java program that displays the following palindromic
 sequence of numbers:
 (A palindromic sequence of numbers means the sequence stays the same when the numbers
 are reversed)
 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 18, 16, 14, 12, 10, 8, 6, 4, 2
*/

public class Lab2_Task2
{
    public static void main (String[]args)
    {
        int start = 2;
        int high = 20;
        int low = start;
        for (int i = start; i<=high; i+=2)
        {
            System.out.print(i+", ");
        }
        for (int i = high-2; i>=low; i-=2)
        {
            if (i==low)
            {
                System.out.print(i);
            }
            else
            {
                System.out.print(i+", ");
            }
        }
    }
}