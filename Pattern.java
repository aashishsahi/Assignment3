import java.util.Scanner;
public class Pattern {
	
	public static void Draw()
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		n = sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String [] args)
	{
		Draw();
	}
}
