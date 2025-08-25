public class java2 {
    class students {
        String name;
        int age;

        students(String n, int a) {
            name = n;
            age = a;
        }

        void display() {
            System.out.println("Name: " + name + " Age: " + age);
        }

    }

    public static void main(String[] args) {
        java2 outer = new java2();
        students s1 = outer.new students("John", 20);
        s1.display();

    }
}