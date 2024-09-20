/* Fibonacci sequence is a sequence in which each number is the sum of the two preceding
numbers, where starting values are most commonly two 1s (1, 1, . . .)
(b) Write a java program to display the fibonacci sequence until an input number, along with
the sum of the sequence

Sample Input
15

Sample Output
1 1 2 3 5 8 13
Sum = 33
*/

import java.util.Scanner;
public class Lab2_Task7b
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int a = 1;
        int b = 1;
        int f_sum = a+b;
        System.out.print(a + " " + b + " ");
        for (; sum<n; )
        {
            sum = a + b;
            if (sum>n)
            {
                break;
            }
            System.out.print(sum + " ");
            a = b;
            b = sum;
            f_sum+=sum;
        }
        System.out.println();
        System.out.println("Sum = "+ f_sum);
    }
}