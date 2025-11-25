// Thread by extending Thread class
class MyThread extends Thread {
    private String threadName;
    
    public MyThread(String name) {
        this.threadName = name;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted");
            }
        }
        System.out.println(threadName + " finished");
    }
}

// Thread by implementing Runnable interface
class MyRunnable implements Runnable {
    private String taskName;
    
    public MyRunnable(String name) {
        this.taskName = name;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(taskName + " - Task: " + i);
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                System.out.println(taskName + " interrupted");
            }
        }
        System.out.println(taskName + " completed");
    }
}

// Synchronized method example
class Counter {
    private int count = 0;
    
    public synchronized void increment() {
        count++;
    }
    
    public int getCount() {
        return count;
    }
}

public class Multithreading {
    public static void main(String[] args) {
        System.out.println("=== Multithreading Demo ===");
        
        // Creating threads by extending Thread class
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");
        
        // Creating threads by implementing Runnable
        Thread thread3 = new Thread(new MyRunnable("Task-A"));
        Thread thread4 = new Thread(new MyRunnable("Task-B"));
        
        // Starting threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        
        // Synchronized counter example
        Counter counter = new Counter();
        
        Thread incrementer1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        
        Thread incrementer2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        
        incrementer1.start();
        incrementer2.start();
        
        try {
            incrementer1.join();
            incrementer2.join();
            System.out.println("Final counter value: " + counter.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}