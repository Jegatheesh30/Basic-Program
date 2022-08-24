package Operators;

public class ArithmeticOperations {

	public static void main(String[] args) {
		{
		        //Addition 
				int a=23, b=9;
				int sum = a+b;
				System.out.println("Addition");
				System.out.println("a=21, b=32");
				System.out.println("sum1: "+sum);
				}
				
				//Addition for decimal
				{
				double a=32.23, b=12.2323;
				int a1 = (int)a;
				int b1 = (int)b;
				int sum=a1+b1;
				System.out.println("Addition decimal");
				System.out.println("a=32.23, b=12.2323");
				System.out.println("sum2: "+sum);
				}
				
				{
					//Subtraction
				int a=23, b=45;
				int sum = a-=b;
				System.out.println("Substraction");
				System.out.println("a=23, b=45");
				System.out.println("sum3: "+sum);	
				}
				{
				 //Multiplication
				int a=21, b=32;
				int sum = a*=b;
				System.out.println("Mulitiplication");
				System.out.println("a=21, b=32");
				System.out.println("sum4: "+sum);
				}
				{
				//Devision
				int a=21, b=32;
				int sum = a/=b;
				System.out.println("Devision");
				System.out.println("a=21, b=32");
				System.out.println("sum5 :" + sum);
				}
				{
				//remainder
			    int a=21, b=32;
		        int sum = a%=b;
		        System.out.println("remainder");
		        System.out.println("a=21, b=32");
		        System.out.println("sum6: "+sum);
				}
		       
	}

}
