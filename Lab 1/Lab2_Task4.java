/* Write a java program that takes 10 inputs from the user in a loop, and displays the sum,
average, minimum and maximum of ONLY THE POSITIVE ODD NUMBERS from those
numbers. If no such numbers are found, then display the message “No odd positive numbers
found”.

Sample Input
1 4 2 9 2 -4 3 -1 0 1

Sample Output
Sum = 14
Minimum = 1
Maximum = 9
Average = 3.5

Sample Input
34 -11 50 24 -24 2 -4 0 8 12

Sample Output
No odd positive numbers found
*/

import java.util.Scanner;
public class Lab2_Task4
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int sum  = 0;
        int min = 0;
        int max = 0;
        double avg = 0;
        double odd_count = 0.0;
        for (int i = 1; i<=10; i++)
        {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num > 0 && num % 2 != 0)
            {
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
                odd_count++;
            }
        }
        if (sum!=0)
        {
            avg = sum/odd_count;
            System.out.println("Sum = " + sum);
            System.out.println("Minimum = " + min);
            System.out.println("Maximum = " + max);
            System.out.println("Average = "+ avg);
        }
        else
        {
            System.out.println("No odd positive numbers found");
        }
    }
}