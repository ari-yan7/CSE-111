/* Write a java program that when given an amount of money, it calculates how many paper notes
it will take to represent it. For simplicity let's assume we have only 500, 100, 50,10, 5 and 1
paper notes available.
Note: You cannot use multiplication or division for this task

Sample input
1500
Sample output
3 500's note

Sample input
3724
Sample output
7 500's note
2 100's note
2 10's note
4 1's note
*/

import java.util.Scanner;
public class Lab2_Task10
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int count500 = 0, count100 = 0, count50 = 0, count10 = 0, count5 = 0, count1 = 0;
        for (;n>=0;)
        {
            if (n >= 500)
            {
                n = n - 500;
                count500++;
            }
            else
            {
                break;
            }
        }
        for (;n>=0;)
        {
            if (n >= 100)
            {
                n = n - 100;
                count100++;
            }
            else
            {
                break;
            }
        }
        for (;n>=0;)
        {
            if (n >= 50)
            {
                n = n - 50;
                count50++;
            }
            else
            {
                break;
            }
        }
        for (;n>=0;)
        {
            if (n >= 10)
            {
                n = n - 10;
                count10++;
            }
            else
            {
                break;
            }
        }
        for (;n>=0;)
        {
            if (n >= 5)
            {
                n = n - 5;
                count5++;
            }
            else
            {
                break;
            }
        }
        for (;n>=0;)
        {
            if (n >= 1)
            {
                n = n - 1;
                count1++;
            }
            else
            {
                break;
            }
        }
        if (count500!=0)
        {
            System.out.println(count500+" 500's note");
        }
        if (count100!=0)
        {
            System.out.println(count100+" 100's note");
        }
        if (count50!=0)
        {
            System.out.println(count50+" 50's note");
        }
        if (count10!=0)
        {
            System.out.println(count10+" 10's note");
        }
        if (count5!=0)
        {
            System.out.println(count5+" 5's note");
        }
        if (count1!=0)
        {
            System.out.println(count1+" 1's note");
        }
    }
}