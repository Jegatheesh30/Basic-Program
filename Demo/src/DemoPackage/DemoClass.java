package DemoPackage;

public class DemoClass {
	public static void main(String[]args) {
		System.out.println("BEFORE SWAPPING");
	int x=25;
	int y=23;
	System.out.println("x="+x);
	System.out.println("y="+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("AFTER SWAPPING");
	System.out.println("x="+x);
	System.out.println("y="+y);
	}
}
