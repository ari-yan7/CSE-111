/* Write a java program to calculate weighted average of 5 decimal numbers, where the numbers
will be given in the following format:
num1 weight1
num2 weight2
num3 weight3
num4 weight4
num5 weight5
The formula for calculating weighted average is as follows:
w = 𝑠𝑢𝑚(𝑤𝑒𝑖𝑔ℎ𝑡*𝑛𝑢𝑚𝑏𝑒𝑟)/𝑠𝑢𝑚(𝑤𝑒𝑖𝑔ℎ𝑡)

Sample Input
95.5 2
72.1 4
-3.8 1
0 2
59 1

Sample Output
Weighted Average = 53.459999999999994

Sample Input
3 2
4 2
5 2
6 2
7 3

Sample Output
Weighted Average = 5.181818181818182
*/

import java.util.Scanner;
public class Lab2_Task6
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        double sumWeight = 0.0;
        double sumWeighted = 0.0;
        double weightedAverage = 0.0;
        for (int i = 1; i<=5; i++)
        {
            double num = sc.nextDouble();
            int weight = sc.nextInt();
            sumWeight += weight;
            sumWeighted += (num * weight);
        }
        weightedAverage = sumWeighted / sumWeight;
        System.out.println("Weighted Average = " + weightedAverage);
    }
}