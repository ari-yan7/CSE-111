/* Write a Java program that takes a string input in small letters from the user
and prints the previous alphabet in sequence for each alphabet found in the input

Sample input
wxyz
Sample output
vwxy

Sample input
abcd
Sample output
zabc
*/

import java.util.Scanner;
public class Lab3_String_Task2
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();
        String str2 = "";
        for (int i = 0; i<str.length(); i++)
        {
            int new_ascii = 0;
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if (ascii == 97)
            {
                new_ascii = 122;
                str2+=(char)new_ascii;
            }
            else
            {
                new_ascii = ascii-1;
                str2+=(char)new_ascii;
            }
        }
        System.out.println(str2);
    }
}