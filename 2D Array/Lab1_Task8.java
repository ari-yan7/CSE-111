import java.util.Scanner;

public class Lab1_Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Row = ");
        int row = sc.nextInt();
        System.out.print("Column = ");
        int column = sc.nextInt();
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("2D Array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("1D Array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}