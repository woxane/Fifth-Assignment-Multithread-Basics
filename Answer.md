# Multithread Answers 

## Table of answers
- [First Question](#First-Question)


## First Question
### code
```java
public static class SleepThread extends Thread {
        public void run() {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!");
            } finally {
                System.out.println("Thread will be finished here!!!");
            }
        }
    }

    public static void main(String[] args) {
        SleepThread thread = new SleepThread();
        thread.start();
        thread.interrupt();
    }
```
After we interrupt the thread , as we know it will throw an **InterruptedException** , causing the catch block to execute.
So it prints `Thread was interrupted!` . Then the finally block runs and prints `Thread will be finished here!!!`.
