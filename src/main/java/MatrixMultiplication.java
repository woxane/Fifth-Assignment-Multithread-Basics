import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MatrixMultiplication {

    public static class BlockMultiplier implements Runnable {
        /*
            A specific Block of the two matrices will be multiplied in the run() method of this class
         */
        List<List<Double>> matrix_A;
        List<List<Double>> matrix_B;
        List<List<Double>> temp_matrix;
        int start_row;
        int end_row;
        int start_col;
        int end_col;
        int q;

        public BlockMultiplier(List<List<Double>> matrix_A, List<List<Double>> matrix_B, int start_row, int end_row, int start_col, int end_col, int q) {
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
                List<Double> row = Collections.nCopies(cols, 0.0);
                temp_matrix.add(row);
            }
            this.q = matrix_A.get(0).size();
        }

        @Override
        public void run() {
            /*
                Do the calculation and put the final values into the matrix_Crix
             */
            // TODO
        }
    }

    public static List<List<Double>> ParallelizeMatMul(List<List<Double>> matrix_A, List<List<Double>> matrix_B) {
        List<List<Double>> matrix_C = new ArrayList<>();
        int rows = matrix_A.size();
        int cols = matrix_B.get(0).size();
        for (int i = 0; i < rows; i++) {
            List<Double> row = Collections.nCopies(cols, 0.0);
            matrix_C.add(row);
        }
        /*
            Parallelize the matrix multiplication by dividing tasks between 4 threads..
         */
        // TODO
        return matrix_C;
    }

    public static void main(String[] args) {
        /*
            Test your code here
         */
    }
}
