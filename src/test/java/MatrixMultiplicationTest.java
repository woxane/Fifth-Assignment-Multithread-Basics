import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import sbu.cs.MatrixMultiplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MatrixMultiplicationTest {
    static List<List<Integer>> matrix_A;
    static List<List<Integer>> matrix_B;
    static List<List<Integer>> matrix_C;

    @BeforeAll
    public static void initialize() {
        matrix_A = readMatrixFromCSV("src/test/resources/matrix_A.csv"); // 100 X 200
        matrix_B = readMatrixFromCSV("src/test/resources/matrix_B.csv"); // 200 X 100
        matrix_C = readMatrixFromCSV("src/test/resources/matrix_C.csv"); // 100 X 100
    }

    private static List<List<Integer>> readMatrixFromCSV(String filename) {
        List<List<Integer>> matrix = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                List<Integer> row = new ArrayList<>();
                for (String value : values) {
                    row.add(Integer.parseInt(value));
                }
                matrix.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return matrix;
    }

    // The maximum time excepted to calculate the matrix multiplication is 500 milliseconds
    @Test
    public void testParallelizeMatMul() {
        Assertions.assertTrue(matrix_C.equals(MatrixMultiplication.ParallelizeMatMul(matrix_A, matrix_B)));
    }
}
