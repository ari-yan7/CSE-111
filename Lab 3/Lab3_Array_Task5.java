/* Write a Java program that asks the user the length of an array (N) then takes N
number of integers as elements for the array as input. First, remove the consecutive
duplicate elements from the original array to form a new array. Then print the number of
elements removed from the original array

Sample input
N = 8
Please enter the elements of the array:
5
2
1
1
2
3
3
3
Sample output
New Array : 5 2 1 2 3
Removed elements : 3
*/

import java.util.Scanner;
public class Lab3_Array_Task5
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        int [] arr2 = new int [N];
        System.out.println("Please enter the elements of the array: ");
        for (int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int j = 0;
        arr2[j++] = arr[0];
        for (int i = 1; i < N; i++)
        {
            if (arr[i] != arr[i-1])
            {
                arr2[j++] = arr[i];
            }
            else
            {
                count++;
            }
        }
        System.out.println("New Array : ");
        for (int i = 0; i < j; i++)
        {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("\nRemoved elements : " + count);
    }
}