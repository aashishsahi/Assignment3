import java.util.Scanner;
public class GreatestNumber {
	
	public static void Greatest()
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		a = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		b = sc.nextInt();
		System.out.println("Enter 3rd number: ");
		c = sc.nextInt();
		sc.close();
		if(a>b)
		{
			if(a>c)
				System.out.println("1st number is greatest.");
			else
				System.out.println("3rd number is greatest.");	
		}
		else
		{
			if(b>c)
				System.out.println("2nd number is greatest.");
			else
				System.out.println("3rd number is greatest.");
		}
	}

	public static void main(String [] args)
	{
		Greatest();
	}
	
}
