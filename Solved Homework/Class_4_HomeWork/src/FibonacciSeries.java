import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the lenth of Fibonacci ");
		int n=sc.nextInt();
		int x=0;
		int y=1;
		int sum;
		
		for(int i=0;i<n;i++) {
			System.out.println(x+" ");
			sum=x+y;
			x=y;
			y=sum;
			
		}

	}

}
