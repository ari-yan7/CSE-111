/* (b) Write a java program that encrypts an input integer by multiplying each digit by 7.
(Hint: You will need to use the code from part a).

Sample input
3705
Sample output
21 49 0 35
*/

import java.util.Scanner;
public class Lab2_Task9b
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        String strNum = ""+ num;
        int n = strNum.length();
        int[]array = new int [n];
        int div = 0;
        int count = 0;
        for (int i = 1; num>0; i++)
        {
            int prod = 0;
            div = num/10;
            int rem = num%10;
            prod = rem * 7;
            array[count] = prod;
            num = div;
            count = i;
        }
        for (int j = array.length-1; j>=0; j--)
        {
            System.out.print(array[j]+" ");
        }
    }
}