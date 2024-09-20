/* Write a Java program that asks the user for the length of an array and then
creates an integer array of that length by taking inputs from the user. Then, reverse the
original array without creating any new array and print it. [In-place reverse]

Sample input
Enter the length of the array: 5
7
-31
344
97
100
Sample output
100 97 344 -31 7
*/

import java.util.Scanner;
public class Lab3_Array_Task3
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}