package Operators;
import java.util.Scanner;
public class TernaryOperator {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			int marks=input.nextInt();
			String result = (marks > 40)?"pass":"fail";
			System.out.println("You " + result + " the exam.");
		
		

	}

}
