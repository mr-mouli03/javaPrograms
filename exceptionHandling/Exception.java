class Exception {
    int divide(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {
        Exception obj = new Exception();
        try {
            System.out.println(obj.divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
