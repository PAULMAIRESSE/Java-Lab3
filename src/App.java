import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            // scan for two integer
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number between 1 and 10: ");
            int a = scan.nextInt();
            System.out.println("Enter another number");
            int b = scan.nextInt();
            scan.close();
            if (a < 1 || a > 10) {
                throw new BadInputException("Number is not between 1 and 10.");
            }
            System.out.println("Factorial of " + a + " is " + factorial(a));
            System.out.println("Division of " + a + " by " + b + " is equal to" + safeDivision(a, b));
        } catch (BadInputException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    public static int factorial(int n) throws BadInputException {
        if (n < 0) {
            throw new BadInputException("n must be greater than or equal to 0");
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int safeDivision(int a, int b) {
        if (b == 0) {
            throw new DivisionByZero();
        }
        return a / b;
    }
}
