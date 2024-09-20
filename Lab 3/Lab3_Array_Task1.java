/* Write a Java program that will take an integer number N from the user and
create an integer array by taking N numbers from the user. Then take another number
from the user and create a new array by removing that number from the input array.
Finally, print the new array

Sample input
N = 5
23
100
0
56
-34
Remove Element = 100

Sample output
Input array:
23 100 0 56 -34
New array:
23 0 56 -34
*/

import java.util.Scanner;
public class Lab3_Array_Task1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input array: ");
        for(int i = 0; i < N; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Remove Element = ");
        int remove = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < N; i++)
        {
            if (arr[i] == remove)
            {
                found = true;
            }
        }
        if (found == true)
        {
            int[] arr2 = new int[N-1];
            int j = 0;
            for(int i = 0; i < N; i++)
            {
                if(arr[i] != remove)
                {
                    arr2[j++] = arr[i];
                }
            }
            for (int i = 0; i < arr2.length; i++)
            {
                System.out.println(arr2[i]+" ");
            }
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}