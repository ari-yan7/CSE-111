/* Write a Java program that will ask the user to input a string (containing
exactly one word). Then your job is to print subsequent substring of the input string

Sample input
BANGLA
Sample output
B
BA
BAN
BANG
BANGL
BANGLA
*/

import java.util.Scanner;
public class Lab3_String_Task3
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String f_str = "";
        for (int i = 0; i<str.length(); i++)
        {
            f_str = f_str + str.charAt(i);
            System.out.println(f_str);
        }
    }
}