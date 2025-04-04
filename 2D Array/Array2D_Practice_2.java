// Question: https://pracprobs.netlify.app/problems/2d-array/#problem-4

public class Array2D_Practice_2 {
    public static void main(String[] args) {
        int[][] A = { { 11, 22, 33, 44 }, { 55, 66, 77, 88 }, { 1, 2, 3, 4 } };
        sumOfBoundary(A);
    }

    public static void sumOfBoundary(int[][] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (i == 0 || i == A.length - 1 || j == 0 || j == A[i].length - 1) {
                    sum += A[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}