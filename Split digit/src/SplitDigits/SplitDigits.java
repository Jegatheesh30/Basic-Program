package SplitDigits;

import java.util.Scanner;

public class SplitDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("enter an integer");
	int num=input.nextInt();
	int a,b,c,d,e,f;
	a = num/10;
	b = num%10;
	c=a/10;
	d=a%10;
	e=c/10;
	f=c%10;
	System.out.println(e);
	System.out.println(f);
	System.out.println(d);
	System.out.println(b);
			
		
}

}
