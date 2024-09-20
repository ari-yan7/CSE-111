/*  Write a java program that takes inputs from the user in a loop until three consecutive zeros
 are entered, then displays the sum, average, minimum and maximum of those numbers. You
 can consider the zeros in the input to be excluded in the sum / max / min / average.

 Sample Input
  4 1 12 54 0 0 37 4 0 0 0
  Sample Output
  Sum = 112
 Minimum = 1
 Maximum = 54
 Average = 18.666666666666668

 Sample Input
 0 0 0
 Sample Output
  No numbers found
*/

import java.util.Scanner;
public class Lab2_Task5
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum  = 0;
        int min = 0;
        int max = 0;
        double avg = 0.0;
        int num_count = 0;
        boolean first_num = true;
        while (true)
        {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            if (num == 0)
            {
                if (count >= 2)
                {
                    break;
                }
                count++;
            }
            else
            {
                count = 0;
                if (first_num)
                {
                    min=num;
                    max=num;
                    first_num = false;
                }
                sum+=num;
                if (num>max)
                {
                    max = num;
                }
                if (num<min)
                {
                    min = num;
                }
                num_count++;
            }
        }
        if (num_count==0)
        {
            System.out.println("No numbers found");
        }
        else
        {
            avg = (double) sum/num_count;
            System.out.println("Sum = " + sum);
            System.out.println("Minimum = " + min);
            System.out.println("Maximum = " + max);
            System.out.println("Average = "+ avg);
        }
    }
}