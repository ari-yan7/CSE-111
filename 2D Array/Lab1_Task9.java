public class Lab1_Task9 {
    public static void main(String[] args) {
        int[][] A = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
        boolean identity = false;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                int row = i;
                int col = j;
                if (row == col && A[row][col] == 1 || row != col && A[row][col] == 0) {
                    identity = true;
                } else {
                    identity = false;
                    break;
                }
            }
        }
        if (identity == true) {
            System.out.println("Identity matrix");
        } else {
            System.out.println("Not an identity matrix");
        }
    }
}