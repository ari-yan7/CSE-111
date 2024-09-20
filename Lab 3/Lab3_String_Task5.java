/* Write a Java program that takes TWO string inputs (containing exactly one
word in each string) from the user. Concatenate those two strings with a single space in
between them. Generate a number which is the sum of all the letters in that concatenated
string where A = 65, Z = 90, a = 97, and z = 122. Your task is to print that concatenated
string and the number generated from that string

Sample inputs
Hello123
Wo%%rld
Sample output
Hello123 Wo%%rld
1020
*/

import java.util.Scanner;
public class Lab3_String_Task5
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        String str3 = str1 + " " + str2;
        int sum = 0;
        for (int i = 0; i < str3.length(); i++)
        {
            char ch = str3.charAt(i);
            int ascii = (int)ch;
            if ((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122))
            {
                sum = sum + ascii;
            }
        }
        System.out.println(str3 + "\n" + sum);
    }
}