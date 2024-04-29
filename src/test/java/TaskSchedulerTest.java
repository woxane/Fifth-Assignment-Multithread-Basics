import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class TaskSchedulerTest {
    @Test
    public void test1() {
        ArrayList<TaskScheduler.Task> tasks = new ArrayList<>();
        TaskScheduler.Task A = new TaskScheduler.Task("A", 100);
        TaskScheduler.Task B = new TaskScheduler.Task("B", 150);
        TaskScheduler.Task C = new TaskScheduler.Task("C", 200);
        TaskScheduler.Task E = new TaskScheduler.Task("E", 130);
        TaskScheduler.Task F = new TaskScheduler.Task("F", 300);
        tasks.add(A);
        tasks.add(B);
        tasks.add(C);
        tasks.add(E);
        tasks.add(F);
        Assert.assertArrayEquals(TaskScheduler.doTasks(tasks).toArray(), new String[]{"F", "C", "B", "E", "A"});
    }
}
