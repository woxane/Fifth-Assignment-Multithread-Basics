import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MatrixMultiplicationTest {
    static MatrixMultiplication obj = new MatrixMultiplication();
    static List<List<Double>> matrix_A;
    static List<List<Double>> matrix_B;
    static List<List<Double>> matrix_C;

    @BeforeClass
    public static void initialize() {
        matrix_A = readMatrixFromCSV("src/test/resources/matrix_A.csv"); // 100 X 200
        matrix_B = readMatrixFromCSV("src/test/resources/matrix_B.csv"); // 200 X 100
        matrix_C = readMatrixFromCSV("src/test/resources/matrix_C.csv"); // 100 X 100
    }

    private static List<List<Double>> readMatrixFromCSV(String filename) {
        List<List<Double>> matrix = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                List<Double> row = new ArrayList<>();
                for (String value : values) {
                    row.add(Double.parseDouble(value));
                }
                matrix.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return matrix;
    }

    // The maximum time excepted to calculate the matrix multiplication is 500 milliseconds
    @Test(timeout = 500)
    public void testParallelizeMatMul() {
        Assert.assertArrayEquals(matrix_C, obj.ParallelizeMatMul(matrix_1, matrix_2));
    }
}
