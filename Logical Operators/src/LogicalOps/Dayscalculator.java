package LogicalOps;
import java.util.Scanner;

public class Dayscalculator {

	public static void main(String[] args) {
		Scanner a1=new Scanner(System.in);
		System.out.println("enter an integrer");
		int a=a1.nextInt();
		{
		if(a>0&&a<=6)
			System.out.println("Week days");
		else if(a==6||a==7)
			System.out.println("Week end");
		}	
	}
		}
	
			
	


