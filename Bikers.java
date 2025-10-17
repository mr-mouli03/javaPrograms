import java.util.*;
public class Bikers {
    static int a[] = new int[5];
    static float avg ;
    static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the speed of 5 bikers");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        avg = sum / a.length;
        System.out.println("average speed of bikers is " + avg);
        for (int i = 0; i < a.length; i++) {
            if (a[i] > avg) {
                System.out.println("speed of qualifying biker " + (i + 1) + " is above average " + a[i]);
            }
        }
        sc.close();
    }
}
