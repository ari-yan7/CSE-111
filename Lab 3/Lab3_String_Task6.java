/* Given a string, create and print a new string with all the consecutive duplicates
removed

Sample input
ABBCCCCCBBAB
Sample output
ABCBAB
*/

import java.util.Scanner;
public class Lab3_String_Task6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String str = sc.nextLine();
        String newStr = "";
        for(int i = 0; i < str.length(); i++)
        {
            if(i == 0 || str.charAt(i) != str.charAt(i-1))
            {
                newStr += str.charAt(i);
            }
        }
        System.out.println("Output: " + newStr);
    }
}