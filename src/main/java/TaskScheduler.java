import java.util.ArrayList;

public class TaskScheduler {
    public static class Task implements Runnable{
        String taskName;
        int processingTime;

        public Task(String taskName, int processingTime) {
            this.taskName = taskName;
            this.processingTime = processingTime;
        }

        @Override
        public void run() {
            /*
                Simulate utilizing CPU by sleeping the thread
                TODO
             */
        }
    }

    public static ArrayList<String> doTasks(ArrayList<Task> tasks) {
        ArrayList<String> finishedTasks = new ArrayList<>();
        /*
            Create a thread for each given task, And then start them based on which task has the highest priority (highest priority belongs to the tasks that take more time to be completed).
            You have to wait for each task to get done and then go for the next tasks.
            Don't forget to add each task's name to the finishedTasks after it's completely finished.
            TODO
         */
        return finishedTasks;
    }

    public static void main(String[] args) {
        /*
            Test your code here
         */
    }
}
