class t1 extends Thread {
    public void run (){
        for (int i=0; i<=5; i++){
        System.out.println("thread A"+i);
        }
        System.out.println("Exit A");
    }
    }
    class t2 extends Thread {
        public void run (){
            for (int i=0; i<=5; i++){
            System.out.println("thread B"+i);
            }
            System.out.println("Exit B");
        }
    }
  public class ExtendThreadClass {
    public static void main(String[] args) {
        t1 obj1 = new t1();
        t2 obj2 = new t2();
        // Thread t = new Thread(obj1);
        obj1.start();
        obj2.start();
    }
}