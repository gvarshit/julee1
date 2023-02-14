package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("please enter a number: ");
			int num1 = scanner.nextInt();
			System.out.println("please enter another number: ");
			int num2 = scanner.nextInt();
			System.out.println("result of division = " + (num1/num2));
		}
		catch(ArithmeticException e) {
			System.out.println("pleasse do not enter a value zero in denominator");
			
		}
		catch ( InputMismatchException e) {
			System.out.println("only integer values allowed");
		}
		catch(Exception e) {
			System.out.println("please enter a valid input");
			
		}finally {
			System.out.println("close DB connection");
			
		}

	}

}