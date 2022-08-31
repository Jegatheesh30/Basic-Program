package LogicalOps;

public class NestLoop {
	public static void main() {
		{
			for(int i=1;i<=7;i++)
			{
			for(int j=1;j<=i;j++)
			{
			System.out.print(j);
			}
			System.out.println();
			}		
			}
			
		System.out.println("Printing ALPHABETS");
		
		for(int j=0;j<=7;j++)
		{
		int alp=65;
		{
		for(int k=0;k<=j;k++)
		{
		System.out.print((char)(alp+k)+" ");
		}
		System.out.println();
		}
		
			
		}	       		
	}

}
