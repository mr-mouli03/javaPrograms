class Student {
    String name;
    int age;
    Student() {
        name = "mouli";
        age = 19;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    } 
    
    void display() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}
public class ConstructorOverloading {
    public static void main(String[]  args) {
        Student s1 = new Student();
        Student s2 = new Student("sai", 20);
        s1.display();
        s2.display();
    }
    
}
