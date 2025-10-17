class Threading extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread is running " + i);
        }
    }

}

public class ThreadDemo {
    public static void main(String[] args) {
        Threading t1 = new Threading();
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        for (int i = 0; i < 10; i++) {
            System.out.println("Main method is running " + i);
        }
    }
}