import java.util.*;

public class test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x and y values");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine(); // Consume the newline character left in the buffer
        System.out.println("Enter a String:");
        String z = sc.nextLine();

        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception has been handled");
        } finally {
            System.out.println("Finally is executing after try-catch");

            try {
                System.out.println(69 / 0);
            } catch (ArithmeticException e1) {
                // Move the 'throw' statement outside the nested 'try-catch' block
                throw new ArithmeticException("Throw is used");
            }
        }
    }
}

