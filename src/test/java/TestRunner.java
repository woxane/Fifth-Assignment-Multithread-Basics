import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result1 = JUnitCore.runClasses(MatrixMultiplicationTest.class);
        Result result2 = JUnitCore.runClasses(TaskSchedulerTest.class);

        for (Failure failure : result1.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result1.wasSuccessful());

        for (Failure failure : result2.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result2.wasSuccessful());
    }
}  