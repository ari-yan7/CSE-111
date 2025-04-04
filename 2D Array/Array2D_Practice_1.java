//Question: https://pracprobs.netlify.app/problems/2d-array/#problem-1

import java.util.Scanner;

public class Array2D_Practice_1 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(2, 2);
    }

    public static int[][] createMatrix(int row, int col) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
}