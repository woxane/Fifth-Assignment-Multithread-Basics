import org.ejml.simple.SimpleMatrix;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MatrixMultiplicationTest {
    static MatrixMultiplication obj = new MatrixMultiplication();
    static double[][] matrix_1;
    static double[][] matrix_2;
    static double[][] final_mat;

    @BeforeClass
    public static void initialize() {
        int row_size = 100;
        int col_size = 100;
        matrix_1 = new double[row_size][col_size];
        matrix_2 = new double[col_size][row_size];
        
        for (int i = 0; i < row_size; i++) {
            for (int j = 0; j < col_size; j++) {
                matrix_1[i][j] = i + j;
                matrix_2[i][j] = i - j;
                // Initializing the matrices
            }
        }

        // Convert Java arrays to EJML matrices
        SimpleMatrix ejmlMatrix1 = new SimpleMatrix(matrix_1);
        SimpleMatrix ejmlMatrix2 = new SimpleMatrix(matrix_2);

        // Perform matrix multiplication
        SimpleMatrix result = ejmlMatrix1.mult(ejmlMatrix2);

        // Convert the result back to a Java array
        final_mat = MatrixMultiplicationTest.matrix2Array(result);
    }

    public static double[][] matrix2Array(SimpleMatrix matrix) {
        double[][] array = new double[matrix.numRows()][matrix.numCols()];
        for (int r = 0; r < matrix.numRows(); r++) {
            for (int c = 0; c < matrix.numCols(); c++) {
                array[r][c] = matrix.get(r, c);
            }
        }
        return array;
    }

    // The maximum time excepted to calculate the matrix multiplication is 500 milliseconds
    @Test(timeout = 500)
    public void testParallelizeMatMul() {
        Assert.assertArrayEquals(final_mat, obj.ParallelizeMatMul(matrix_1, matrix_2));
    }
}
