/* Write a Java program that will take an integer number N from the user and
create an integer array by taking N numbers from the user. Print how many times each
number appears in the array

Sample input
N = 5
6
15
14
15
6
Sample output
6 - 2 times
15 - 2 times
14 - 1 times
*/

import java.util.Scanner;
public class Lab3_Array_Task4
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        int [] check = new int [N];
        int count = 1;
        boolean repeat = false;
        for (int i = 0; i < N; i++)
        {
            check [i] = 0;
        }
        for (int i = 0; i<N; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i<N; i++)
        {
            int num = arr[i];
            for (int j = i+1; j<N; j++)
            {
                if (check[j]!=1)
                {
                    int num2 = arr[j];
                    if (num == num2)
                    {
                        count++;
                        check [j] = 1;
                    }
                }
            }
            if (count >= 1 && check[i]!=1)
            {
                System.out.println(arr[i]+" - "+count+"times");
                repeat = true;
                count = 1;
            }
        }
    }
}