package Operators;
import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		{
	        //Addition 
			System.out.println("Addition");
			Scanner in=new Scanner(System.in);
			int a, b;
			System.out.println("Enter 1st integer");
			a=in.nextInt();
			System.out.println("Enter 2nd integer");
			b=in.nextInt();
			int sum = a+b;
			System.out.println("a+b=?");
			System.out.println("sum1: a+b ="+sum);
			}
			
			//Addition for decimal
			{
			System.out.println("Addition decimal");
			Scanner in=new Scanner(System.in);
			System.out.println("Enter 1st double");
			double a,b;
			a=in.nextDouble();
			System.out.println("Enter 2nd double");
			b=in.nextDouble();
			double sum= a+b;
			System.out.println("sum2: a+b ="+sum);
			}
			
			{
				//Subtraction
			System.out.println("Substraction");
			Scanner in=new Scanner(System.in);
			System.out.println("Enter 1st integer");
			int a,b;
			a=in.nextInt();
			System.out.println("enter 2nd integer");
			b=in.nextInt();
			int sum = a-=b;
			System.out.println("sum3: a-b = "+sum);	
			}
			{
			 //Multiplication
			System.out.println("Multiplication");
			Scanner in=new Scanner(System.in);
			System.out.println("Enter 1st integer");
			int a,b;
			a=in.nextInt();
			System.out.println("Enter 2nd integer");
			b=in.nextInt();
			int sum = a*=b;
			System.out.println("sum4: a*b = "+sum);
			}
			{
			//Devision
			System.out.println("Devision");
			Scanner in =new Scanner(System.in);
			System.out.println("Enter 1st integer");
			int a,b;
			a=in.nextInt();
			System.out.println("Enter 2nd integer");
			b=in.nextInt();
			int sum = a/=b;
			System.out.println("sum5: a/b =" + sum);
			}
			{
			//remainder
			System.out.println("Remainder");
			Scanner ob=new Scanner(System.in);
			System.out.println("Enter 1st integer");
			int a,b;
			a=ob.nextInt();
			System.out.println("Enter 2nd integer");
			b=ob.nextInt();
	        int sum = a%=b;
	        System.out.println("sum6: a%b  = "+sum);
			}
	       
		       
	}

}
