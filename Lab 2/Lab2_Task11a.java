/* Square pattern
 
Sample input
5
Sample output
*****
*****
*****
*****
*****
*/

import java.util.Scanner;
public class Lab2_Task11a
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}