import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number (a):");
        double a = sc.nextDouble();

        System.out.println("Enter your second number (b):");
        double b = sc.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1: + (Addition) a + b");
        System.out.println("2: - (Subtraction) a - b");
        System.out.println("3: * (Multiplication) a * b");
        System.out.println("4: / (Division) a / b");
        System.out.println("5: % (Modulo or remainder) a % b");
        int button = sc.nextInt();

        double result;
        switch (button) {
            case 1:
                result = a + b;
                System.out.println("Result is: " + result);
                break;

            case 2:
                result = a - b;
                System.out.println("Result is: " + result);
                break;

            case 3:
                result = a * b;
                System.out.println("Result is: " + result);
                break;

            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result is: " + result);
                } else {
                    System.out.println("You have entered zero which is invalid for division.");
                }
                break;

            case 5:
                if (b != 0) {
                    result = a % b;
                    System.out.println("Result is: " + result);
                } else {
                    System.out.println("You have entered zero which is invalid for modulo.");
                }
                break;

            default:
                System.out.println("Invalid operation selected.");
                break;
        }

        sc.close();
    }
}
