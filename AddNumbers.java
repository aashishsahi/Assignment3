import java.util.Scanner;
public class AddNumbers {
	
	public static int AddNumber()
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st no. ");
		a=sc.nextInt();
		System.out.print("Enter 2nd no. ");
		b=sc.nextInt();
		c = a + b;
		sc.close();
		return c;
	}

	public static void main(String[] args) {
		int Sum;
		Sum = AddNumber();
		System.out.println("Sum is: " + Sum);

	}

}
