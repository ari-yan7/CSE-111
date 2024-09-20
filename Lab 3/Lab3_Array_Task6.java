/* Write a program that asks the user how many numbers to take. Then takes that
many numbers in an array and prints the median value.
[How to Find the Median Value: http://www.mathsisfun.com/median.html]

Sample input
5
10
50
40
20
30
Sample output
The median is 30.
Explanation: 30 falls in middle 10, 20, 30, 40,
50

Sample input
4
30
10
40
20
Sample output
The median is 25.
Explanation: (20+30)/2=25 (average of two
middle values from 10, 20, 30, 40)
*/

import java.util.Scanner;
public class Lab3_Array_Task6
{
    public static void main(String[] args)
    {
        System.out.print("Number of inputs: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int median = 0;
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        if (n % 2 == 0)
        {
            median = (arr[n/2] + arr[n/2 - 1])/2;
        }
        else
        {
            median = arr[n/2];
        }
        System.out.println("The median is " + median + ".");
    }
}