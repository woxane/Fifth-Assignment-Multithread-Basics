import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import sbu.cs.TaskScheduler.Task;
import sbu.cs.TaskScheduler;

public class TaskSchedulerTest {

    @Test
    public void test1() {
        ArrayList<Task> tasks = new ArrayList<>();

        tasks.add(new Task("A", 100));
        tasks.add(new Task("B", 150));
        tasks.add(new Task("C", 200));
        tasks.add(new Task("E", 130));
        tasks.add(new Task("F", 300));

        Assertions.assertArrayEquals(TaskScheduler.doTasks(tasks).toArray(), new String[]{"F", "C", "B", "E", "A"});
    }

    @Test
    public void test2() {
        ArrayList<Task> tasks = new ArrayList<>();

        tasks.add(new Task("A", 200));
        tasks.add(new Task("B", 250));
        tasks.add(new Task("C", 150));
        tasks.add(new Task("E", 500));
        tasks.add(new Task("F", 50));
        tasks.add(new Task("G", 300));

        Assertions.assertArrayEquals(TaskScheduler.doTasks(tasks).toArray(), new String[]{"E", "G", "B", "A", "C", "F"});
    }
}
