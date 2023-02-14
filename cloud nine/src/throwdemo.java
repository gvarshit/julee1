import java.util.Scanner;

public class throwdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the day");
		String day = scanner.nextLine();
		if(day.equals("monday")) {
	       throw new ArithmeticException();
		}else {
			System.out.println("we are heasding towards weekennd");
		}

	}

}
