public class MatrixMultiplication {

    public static class BlockMultiplier implements Runnable {
        /*
            A specific Block of the two matrices will be multiplied in the run() method of this class
         */
        double[][] matrix_1;
        double[][] matrix_2;
        double[][] final_mat;
        int start_i;
        int end_i;

        public BlockMultiplier(double[][] matrix_1, double[][] matrix_2, double[][] final_mat, int start_i, int end_i) {
            this.matrix_1 = matrix_1;
            this.matrix_2 = matrix_2;
            this.final_mat = final_mat;
            this.start_i = start_i;
            this.end_i = end_i;
        }

        @Override
        public void run() {
            /*
                Do the calculation and put the final values into the final_matrix
             */
            // TODO
        }
    }

    public double[][] ParallelizeMatMul(double[][] matrix_1, double[][] matrix_2) {
        double[][] final_mat = new double[100][100];
        /*
            Parallelize the matrix multiplication by dividing tasks between 4 threads..
         */
        // TODO
        return final_mat;
    }

    public static void main(String[] args) {
        /*
            Test your code here
         */
    }
}
