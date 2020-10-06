import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a positive number");
		int x=sc.nextInt();
		String b="Yes";
		
		for(int i=2;i<=java.lang.Math.sqrt(x);i++) {
			if(x%i==0) {
				b="No";
				break;
			}
		}
		System.out.println(b);
	}

}
