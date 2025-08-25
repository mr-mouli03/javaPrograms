
// public class exception {
//     static void validate(int age) {
//         // if (age < 18) {
//         //     throw new IndexOutOfBoundsException("not valid");
//         // } else {
//         //     System.out.println("welcome to vote");
//         // }
//     }
//     public static void main(String[] args) {
//         try{
//         validate(13);
//         }catch(IndexOutOfBoundsException e) {
//             System.out.println("Exception occured: "+e.getMessage());
//         }
//         System.out.println("rest of the code...");
//     }
// }





public class exception {
    static void validate( int age ) {
        if (age < 18) {
            throw new ArithmeticException("You are under 18");
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) {
        try {
            validate(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}