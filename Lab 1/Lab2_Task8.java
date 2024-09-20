/* Write a java program that takes 2 integer numbers as input and calculates how many prime
numbers exist between them

Sample input
10 15
Sample output
There are 2 prime numbers between 10 and 15.
*/

import java.util.Scanner;
public class Lab2_Task8
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Start = ");
        int start = sc.nextInt();
        System.out.print("End = ");
        int end = sc.nextInt();
        int prime = 0;
        if (start>end)
        {
            for (int i = end; i<=start; i++)
            {
                int div = 0;
                for (int j = 1; j<=i; j++)
                {
                    if (i%j==0)
                    {
                        div++;
                    }
                }
                if (div == 2)
                {
                    prime++;
                }
            }
            System.out.printf("There are %d prime numbers between %d and %d.",prime,end,start);
        }
        else
        {
            for (int i = start; i<=end; i++)
            {
                int div = 0;
                for (int j = 1; j<=i; j++)
                {
                    if (i%j==0)
                    {
                        div++;
                    }
                }
                if (div == 2)
                {
                    prime++;
                }
            }
            System.out.printf("There are %d prime numbers between %d and %d.",prime,start,end);
        }
    }
}