import java.util.*;
public class Pattern_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<(i*2)+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
