import java.util.Scanner;
public class Palindrome {

	public static boolean check()
	{
		int n,a,r,s=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		n = sc.nextInt();
		sc.close();
		a=n;
		while(n!=0)
		{
			r = n%10;
			s = s*10 + r;
			n=n/10;
		}
		if(s==a)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		boolean a;
		a = check();
		if(a)
			System.out.println("Number is palindrome.");
		else
			System.out.println("Number is not palindrome.");
		
	}

}
