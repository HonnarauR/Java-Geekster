import java.util.Scanner;
public class Patrern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<(n*2)+(n/2);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}

}
