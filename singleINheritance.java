class parent {
    void act(){
        System.out.println("acting. . .. ");
    }
}

class child extends parent{
    void complete(){
        System.out.println("Completed the Task");
    }
}

public class singleINheritance {
    public static void main(String[] args) {
        child obj = new child();
        obj.act();
        obj.complete(); 
    }
   
}
