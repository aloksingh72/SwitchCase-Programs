import java.util.Scanner;

class Program3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");

		int a = sc.nextInt();
		System.out.print("Enter the second number: ");
		int b = sc.nextInt();

		System.out.print("Chose the  operations:+,-,*,/,% ");
		char c = sc.next().charAt(0);

		// method calling
		getCalculator(c, a, b);

		sc.close();

	}

	public static void getCalculator(char c, int a, int b) {

		switch (c) {
			case '+':
				int sum = a + b;
				System.out.println("the sum of two number" + sum);
				break;

			case '-':
				int sub = a - b;
				System.out.println("the sub of two number" + sub);
				break;

			case '*':
				int mul = a * b;
				System.out.println("the multiplication" + mul);
				break;
			case '/':
				double div = a / b;
				System.out.println("the divison is " + div);
				break;
			case '%':
				int mod = a % b;
				System.out.println("the mod is " + mod);
				break;

			default:
				System.out.println("Nikal yaha se aukaat me rahekar baat kar");

		}

	}

}