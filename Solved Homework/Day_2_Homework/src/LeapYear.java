import java.util.Scanner;


public class LeapYear {

	public static void main(String[] args) {
		
		System.out.println("Enter a year");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
	
		if(year%4==0)
		{
			if(year%100==0 && year%400!=0) {
				System.out.println("Its Not a Leap Year");
			}
			else System.out.println("Its a Leap year");
		}
		else System.out.println("Not a Leap year");
		

	}

}
