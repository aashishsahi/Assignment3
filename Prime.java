import java.util.Scanner;

public class Prime {

	public static boolean check()
	{
		boolean a=true;
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		n = sc.nextInt();
		sc.close();
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				a = false;
				break;
			}
		}
		return a;
	}
	
	public static void main(String [] args)
	{
		boolean a;
		a = check();
		if(a)
			System.out.println("Entered number is prime.");
		else
			System.out.println("Entered number is not prime.");
	}
}
