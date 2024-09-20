/* Triangle pattern

Sample input
5
Sample output
*
**
***
****
*****
*/

import java.util.Scanner;
public class Lab2_Task11b
{
 public static void main (String[]args)
 {
  Scanner sc=new Scanner(System.in);
  int row=sc.nextInt();
  int count=1;
  while (count<=row)
  {
   int a=1;
   while (a<=count)
   {
    System.out.print("*");
    a++;
   }
   System.out.println();
   count++; 
  }
 }
}