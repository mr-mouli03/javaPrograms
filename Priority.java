public class Priority extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        Priority t1 = new Priority();
        Priority t2 = new Priority();
        System.out.println("Thread 1 priority: " + t1.MIN_PRIORITY);
        System.out.println("Thread 1 priority: " + t1.NORM_PRIORITY);
        System.out.println("Thread 1 priority: " + t1.MAX_PRIORITY);


        System.out.println("Thread 1 priority: " + t1.getPriority());
        System.out.println("Thread 2 priority: " + t2.getPriority());
        t2.setPriority(10);
        System.out.println("Thread 2 updated priority: " + t2.getPriority());
        t1.start();
        t2.start();
    }
    
}
