# Fifth-Assignment-Multithread-Basics

## Table of contents

- [Introduction 👋](#introduction-)
- [Objectives 🎯](#objectives-)
- [Tasks 📋](#tasks-)
   - [Theoretical Questions 📝](#theoretical-questions-)
   - [Practical Questions 💻](#practical-questions-)
- [Evaluation ⚖️](#evaluation-)
- [Submission ⌛](#submission-)
- [Resources 📚](#resources-)

## Introduction 👋

Welcome to your Sixth Advanced Programming (AP) journey, where you'll delve into the fascinating world of multithreading in Java. This project is divided into two main sections:

1. **Theoretical Questions**: This section is designed to deepen your understanding of key multithreading concepts in Java. You'll explore topics such as the `Runnable` interface, the `Thread` class, the `interrupt()` method, and the `run()` method, and engage with thought-provoking questions that challenge your theoretical knowledge.

2. **Practical Questions**: In this section, you'll get hands-on experience with multithreading in Java. You'll have the opportunity to write code that implements the theoretical concepts you've learned, providing you with practical understanding and experience.


## Objectives 🎯

By completing this assignment, you will:

- Deepen your understanding of **multithreading** in Java and apply the concepts effectively.
- Gain familiarity with key multithreading concepts such as the `Runnable` interface, the `Thread` class, the `interrupt()` method, and the `run()` method.

Please note that while this assignment covers many important aspects of multithreading, there are some advanced topics such as race condition, synchronization, and others that won't be covered in this assignment and will be introduced in the following week. However, a solid understanding of the concepts covered in this assignment is crucial for grasping those advanced topics.

## Tasks 📋

### Theoretical Questions 📝 

~add note about MD file.

1. **What is the behavior of a sleeping thread in Java when its interruption flag is checked from within the thread itself?** ~~
    - *Hint*: Consider the role of the `InterruptedException` and the `Thread.interrupted()` method.
```java
public class SleepThread extends Thread {
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SleepThread thread = new SleepThread();
        thread.start();
        thread.interrupt();
    }
}
```
2. **In Java, what would be the outcome if the `run()` method of a `Runnable` object is invoked directly, without initiating it inside a `Thread` object?**
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
3. **Elaborate on the sequence of events that occur when the `join()` method of a thread (let's call it `Thread_0`) is invoked within the `Main()` method of a Java program?**
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

### Practical Questions 💻

Under process

## Evaluation ⚖️

Your work on this assignment will be evaluated based on:

- **Understanding of Multithreading Concepts**: Your ability to accurately answer the theoretical questions, demonstrating a deep understanding of multithreading in Java. Please note that the answers to the theoretical questions should be provided separately in a markdown file.

- **Practical Implementation**: Your ability to correctly implement multithreading concepts in Java in the practical questions. This includes creating and managing threads, using the `Runnable` interface and the `Thread` class, handling thread interruptions, and invoking the `run()` method.

- **Code Quality**: Your code should be well-structured, readable, and efficient. Proper use of Java conventions, including variable naming, class structure, and comments, will also be considered.

## Submission ⌛

1. Add your mentor as a contributor to the project.
2. Create a `develop` branch for implementing features.
3. Use Git for regular code commits.
4. Push your code to the remote repository.
5. Submit a pull request to merge the `develop` branch with `main`.

The deadline for submitting your code is **Wednesday, May 8** (19th of Ordibehesht)

## Resources 📚

For assistance with this assignment, you may refer to the following resources:

🔗 [Multithreading in Java on Java Point](https://www.javatpoint.com/multithreading-in-java)

🔗 [Multithreading in Java on Tutorials Point](https://www.tutorialspoint.com/java/java_multithreading.htm)

🔗 [Multithreading in Java on Geeks for Geeks](https://www.geeksforgeeks.org/multithreading-in-java/)

Also, you can find a wealth of knowledge from various YouTube courses. They can be a great source of learning. Alongside, joining discussions on forums and reading helpful documents can also be beneficial.
