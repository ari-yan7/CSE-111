/* Write a program that reads 5 numbers into an array and prints the smallest and
largest number and their location in the array

Sample input
7
13
2
10
6
Sample output
The largest number 13 was found at location 1.
The smallest number 2 was found at location 2.
*/

import java.util.Scanner;
public class Lab3_Array_Task2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int max = 0, min = 0, maxIndex = 0, minIndex = 0;
        for (int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i<5; i++)
        {
            int num = arr[i];
            if (i == 0)
            {
                min += num;
                max += num;
                maxIndex = i;
                minIndex = i;
            }
            int temp = num;
            if (temp>max)
            {
                max = temp;
                maxIndex = i;
            }
            if (temp<min)
            {
                min = temp;
                minIndex = i;
            }
        }
        System.out.println("The largest number " + max + " was found at location " + maxIndex);
        System.out.println("The smallest number " + min + " was found at location " + minIndex);
    }
}