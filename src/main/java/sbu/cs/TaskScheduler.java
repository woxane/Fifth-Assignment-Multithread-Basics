package sbu.cs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskScheduler
{
    public static class Task implements Runnable
    {
        /*
            ------------------------- You don't need to modify this part of the code -------------------------
         */
        String taskName;
        int processingTime;

        public Task(String taskName, int processingTime) {
            this.taskName = taskName;
            this.processingTime = processingTime;
        }
        /*
            ------------------------- You don't need to modify this part of the code -------------------------
         */

        @Override
        public void run() {
            /*
            TODO
                Simulate utilizing CPU by sleeping the thread for the specified processingTime
             */
        }
    }

    public static ArrayList<String> doTasks(ArrayList<Task> tasks)
    {
        ArrayList<String> finishedTasks = new ArrayList<>();
        Collections.sort(tasks , (a , b) -> Integer.compare(a.processingTime , b.processingTime));

        for (Task task : tasks) {
            Thread thread = new Thread(task);
            thread.start();

            try {
                thread.join();
            } catch (InterruptedException err) {
                throw new RuntimeException(err);
            }
            finishedTasks.add(task.taskName);

        }
        return finishedTasks;
    }

    public static void main(String[] args) {
        // Test your code here
    }
}
