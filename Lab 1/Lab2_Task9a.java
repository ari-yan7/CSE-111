/* (a) Write a java program to take an integer as input and display how many digits there are in
the number.

Sample input
5500
Sample output
4 digits
*/

import java.util.Scanner;
public class Lab2_Task9a
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int div = 0;
        int count = 0;
        for (int i = 1; num>0; i++)
        {
            div = num/10;
            num = div;
            count = i;
        }
        System.out.print(count+" digits");
    }
}