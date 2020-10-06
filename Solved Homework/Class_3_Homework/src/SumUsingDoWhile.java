import java.util.Scanner;
public class SumUsingDoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		do {
			System.out.println("Enter 2 number");
			int x=sc.nextInt();
			int y=sc.nextInt();
			int sum=x+y;
			System.out.println("Sum of the numbers = "+sum);
			System.out.println("\t Would you wish to continue");
			i=sc.nextInt();
			
		}while(i==1);
	}

}
