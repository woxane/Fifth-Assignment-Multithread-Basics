import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MatrixMultiplication {

    public static class BlockMultiplier implements Runnable {
        /*
            ------------------------- You don't need to modify this part of the code -------------------------
         */
        /*
            A specific Block of the two matrices will be multiplied in the run() method of this class
         */
        List<List<Integer>> matrix_A; // Matrix A is of the form p x q
        List<List<Integer>> matrix_B; // Matrix B is of the form q x r
        List<List<Integer>> temp_matrix; // Matrix to store calculated elements of a quarter of the matrix C
        int start_row;
        int end_row;
        int start_col;
        int end_col;
        int q; // q is the number of the columns of A or rows of B

        public BlockMultiplier(List<List<Integer>> matrix_A, List<List<Integer>> matrix_B, int start_row, int end_row, int start_col, int end_col, int q) {
            this.matrix_A = matrix_A;
            this.matrix_B = matrix_B;
            this.start_row = start_row;
            this.end_row = end_row;
            this.start_col = start_col;
            this.end_col = end_col;
            this.temp_matrix = new ArrayList<>();
            int rows = end_row - start_row + 1;
            int cols = end_col - start_col + 1;
            for (int i = 0; i < rows; i++) {
                List<Integer> row = Collections.nCopies(cols, 0);
                temp_matrix.add(row);
            }
            this.q = matrix_A.get(0).size();
        }
        /*
            ------------------------- You don't need to modify this part of the code -------------------------
         */

        @Override
        public void run() {
            /*
                Do the calculation and put the final values into the matrix_C
             */
            // TODO
        }
    }

    public static List<List<Integer>> ParallelizeMatMul(List<List<Integer>> matrix_A, List<List<Integer>> matrix_B) {
        /*
            ------------------------- You don't need to modify this part of the code -------------------------
         */
        // Matrix A is of the form p x q
        // Matrix B is of the form q x r
        // both p and r are even numbers

        // Matrix C is of the form p x r
        List<List<Integer>> matrix_C = new ArrayList<>();
        int rows = matrix_A.size(); // rows = p
        int cols = matrix_B.get(0).size(); // cols = r
        for (int i = 0; i < rows; i++) {
            // initializing the elements of the matrix C to 0
            List<Integer> row = Collections.nCopies(cols, 0);
            matrix_C.add(row);
        }
        /*
            ------------------------- You don't need to modify this part of the code -------------------------
         */



        /*
            Parallelize the matrix multiplication by dividing tasks between 4 threads..
            TODO
         */
        return matrix_C;
    }

    public static void main(String[] args) {
        /*
            Test your code here
         */
    }
}
