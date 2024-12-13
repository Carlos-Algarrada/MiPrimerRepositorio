public class Calculator {
    String deprecatedMethod = new String("deprecated");

    public int add(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Resultado de 5 + 3 = " + calculator.add(5, 3));
    }
}