/* Write a Java program that will take one string input from the user. Then check
and print whether it is a palindrome

Sample Input
Java
Sample Output
Not a palindrome

Sample Input
madam
Sample Output
Palindrome
*/

import java.util.Scanner;
public class Lab3_String_Task1
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your string");
        String s = sc.nextLine();
        int count = 0;
        for (int leftindex = 0, rightindex = s.length()-1; rightindex>leftindex; leftindex++ , rightindex--)
        {
            if (s.charAt(rightindex)!= s.charAt(leftindex))
            {
                count++;
                break;
            }
        }
        if (count == 0)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Non Palindrome"); 
        }
    }
}