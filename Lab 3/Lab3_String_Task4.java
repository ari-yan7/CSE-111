/* Write a Java program that will ask the user to input a word in small letters
where each of its alphabets is unique and has not been entered before by the user. If the
user does input a word that consists of duplicate alphabets, the program should reject the
user’s input and ask for another word

Sample input
fahim
Sample output
You entered fahim

Sample input
farah
akbor
Sample output
“a” has been counted 2 times in the word
“farah”.
Please enter another word.
You entered akbor.

Sample input
alanna
ronan
john
Sample output
“a” has been counted 3 times in the word
“alanna”.
“n” has been counted 2 times in the word
“alanna”.
“n” has been counted 2 times in the word
“ronan”.
Please enter another word.
You entered john
*/

import java.util.Scanner;
public class Lab3_String_Task4
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        while (true)
        {
            System.out.println("Enter your word: ");
            String name = sc.nextLine();
            int [] check = new int [name.length()];
            int count = 1;
            boolean repeat = false;
            int i = 0;
            for (i = 0; i < name.length(); i++)
            {
                check [i] = 0;
            }
            for (i = 0; i < name.length(); i++)
            {
                char ch = name.charAt(i);
                for (int j = i+1; j < name.length(); j++)
                {
                    if (check[j]!=1)
                    {
                        char ch2 = name.charAt(j);
                        if (ch == ch2)
                        {
                            count++;
                            check [j] = 1;
                        }
                    }
                }
                if (count > 1)
                {
                    System.out.printf(" ''%c'' has been counted %d times in the word ''%s'' %n",ch,count,name);
                    repeat = true;
                    count = 1;
                }
            }
            if (!repeat)
            {
                System.out.printf("You entered %s",name);
                break;
            }
            else
            {
                System.out.println("Please enter another word");
            }
        }
    }
}