package DemoPackage;

public class SwappingThreeDigit {
	public static void main(String[]args) {
		System.out.println("BEFORE SWAPPING");
	int x=4;
	int y=3;
	int z=7;
	System.out.println("x="+x);
	System.out.println("y="+y);
	System.out.println("z="+z);
	x=x+y+z;
	y=(x-y)-z;
	z=(x-y)-z;
	x=x-(y+z);
	System.out.println("AFTER SWAPPING");
	System.out.println("x="+x);
	System.out.println("y="+y);
	System.out.println("z="+z);
	}
}
