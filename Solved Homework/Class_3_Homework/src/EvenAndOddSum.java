import java.util.*;
public class EvenAndOddSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 6 numbers");
		 int oddSum=0;
		 int evenSum=0;
		for(int i=0;i<6;i++) {
			int x=sc.nextInt();
			if(x%2==0) {
				evenSum+=x;
			}
			else oddSum+=x;
			
			}
		System.out.println(evenSum+" "+oddSum);
	}

	
}
