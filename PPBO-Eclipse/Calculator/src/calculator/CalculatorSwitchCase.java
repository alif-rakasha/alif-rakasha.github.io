package calculator;

import java.util.Scanner;

public class CalculatorSwitchCase {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int answer = 0;
		System.out.println("Enter a number: ");
		int num1 = in.nextInt();
		System.out.println("Enter another number: ");
		int num2 = in.nextInt();
		System.out.println("Enter the operand: ");
		char input = in.next().charAt(0);
		
		switch(input) {
		case '*' :
			answer = num1 * num2;
			break;
		case '/' :
			answer = num1 / num2;
			break;
		case '%' :
			answer = num1%num2;
			break;
		case '+' :
			answer = num1 + num2;
			break;
		case '-' :
			answer = num1 - num2;
			break;
		default :
			System.out.println("Invalid Command");
		}
		System.out.println("The result is: "+ answer);
		}
}
