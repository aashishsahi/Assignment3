import java.util.Scanner;
public class LeapYear {
	
	public static boolean CheckYear()
	{
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year ");
		year = sc.nextInt();
		sc.close();
		if(year%100==0)
		{
			if(year%400==0)
				return true;
			else
				return false;
		}
		else if(year%4==0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		boolean check;
		check = CheckYear();
		if(check)
			System.out.println("Entered year is leap year.");
		else
			System.out.println("Entered year is not leap year.");
	}

}
