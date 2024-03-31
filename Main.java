public class Main {
    public static void main(String[] args) {
        String infix = "a+b*(c^d-e/f)+g";
        System.out.println("Infix : " + infix);
        System.out.println("Postfix : " + InfixToPostfix.convert(infix));
    }
}
