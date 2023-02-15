package NumbersPrograms;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter first number: ");
		double a = s.nextDouble();
		System.out.println("Enter second number: ");
		double b = s.nextDouble();
		System.out.println("Enter an operator (+ or - or * /: ");
		double result;
		char operator = s.next().charAt(0);

		switch (operator) {

		case '+':
			result = a + b;
			break;

		case '-':
			result = a - b;
			break;

		case '*':
			result = a * b;
			break;

		case '/':
			result = a / b;
			break;

		default:
			System.out.println("Enter correct operator (+ or - or * /: ");
			return;

		}
		System.out.println(result);
	}

}
