# Multithread Answers 

## Table of answers
- [First Question](#First-Question)
- [Second Question](#Second-Question)
- [Third Question](#Third-Question)



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

## Second Question
### code
```java
public class DirectRunnable implements Runnable {
    public void run() {
        System.out.println("Running in: " + Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        DirectRunnable runnable = new DirectRunnable();
        runnable.run();
    }
}
```
If we invoke the run method of a Runnable object directly without initiating it inside a Thread object , the run method will execute in the same thread that called it . So the output is like : `Running in: main` 

## Third Question
### code
```java
public class JoinThread extends Thread {
    public void run() {
        System.out.println("Running in: " + Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        JoinThread thread = new JoinThread();
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Back to: " + Thread.currentThread().getName());
    }
}
```
After starting the thread , `thread.join()` is called . This means the main thread will wait for the thread until finish its execution.
In JoinThread we have `Running in: Thread_0` and while this thread finished the we have `Back to: main`.