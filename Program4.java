import java.util.Scanner;

class Program4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            // method calling
            getCalculator(sc);  // Pass scanner as a parameter
            System.out.println("Press Y/y to continue....");
            ch = sc.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');

        System.out.println("Program Ends!");

        sc.close();  
    }

    public static void getCalculator(Scanner sc) {  // Scanner passed as argument

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Choose the operation: +, -, *, /, % -> ");
        char c = sc.next().charAt(0);

        switch (c) {
            case '+':
                int sum = a + b;
                System.out.println("The sum of the two numbers: " + sum);
                break;

            case '-':
                int sub = a - b;
                System.out.println("The difference of the two numbers: " + sub);
                break;

            case '*':
                int mul = a * b;
                System.out.println("The product of the two numbers: " + mul);
                break;

            case '/':
                if (b != 0) {
                    double div = (double) a / b;
                    System.out.println("The division result is: " + div);
                } else {
                    System.out.println("Error:  Division by zero is not allowed.");
                }
                break;

            case '%':
                if (b != 0) {
                    int mod = a % b;
                    System.out.println("The modulus is: " + mod);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operation  Please choose a valid operator.");
        }
    }
}
