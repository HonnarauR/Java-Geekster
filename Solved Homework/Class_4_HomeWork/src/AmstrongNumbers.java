import java.util.Scanner;
public class AmstrongNumbers {
	public static int AmSum(int x) {
		int sum=0;
		while(x>0) {
			int y=x%10;
			sum+=(y*y*y);
			x=x/10;
		}
		return sum;	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter max serch for Armstrong");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int sum= AmSum(i);
			if(i==sum) {
				System.out.println(i);
			}
		}

	}

}
