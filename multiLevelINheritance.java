class parent1 {
    void act1(){
        System.out.println("acting started1");
    }
}
class parent2 extends parent1{
    void act2(){
        System.out.println("acting started2");
    }
}

class child extends parent2{
    void complet(){
        System.out.println("completed both Tasks");
    }
}
public class multiLevelINheritance {
    public static void main(String[] args) {
    child obj = new child();
    obj.act1();
    obj.act2();
    obj.complet();
    }
}
