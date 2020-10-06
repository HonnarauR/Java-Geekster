import java.util.Scanner;
public class SumOfFraction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		double sum=1.0000;
		
		for(int i=2;i<=n;i++) {
			sum+=(1/i);
		}
		System.out.println(sum);
		
	}

}
