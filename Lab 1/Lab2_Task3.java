/*  Write a java program that takes 10 inputs from the user in a loop, and displays the sum,
 average, minimum and maximum of those numbers.

 Sample Input
 1 4 2 9 2 -4 3 -1 0 1

 Sample Output
 Sum = 17
Minimum = -4
Maximum = 9
Average = 1.7
*/

import java.util.Scanner;
public class Lab2_Task3
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int sum  = 0;
        int min = 0;
        int max = 0;
        double avg = 0;
        for (int i = 1; i<=10; i++)
        {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (i == 1)
            {
                min+=num;
                max+=num;
            }
            int temp = num;
            sum+=num;
            if (temp>max)
            {
                max = temp;
            }
            if (temp<min)
            {
                min = temp;
            }
        }
        avg = sum/10.0;
        System.out.println("Sum = " + sum);
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        System.out.println("Average = "+ avg);
    }
}