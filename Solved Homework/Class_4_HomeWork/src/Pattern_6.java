import java.util.*;
public class Pattern_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<(i*2)+1;k++) {
				if(k<=i) {
					System.out.print(i+1-k);
				}
				else System.out.print(k+1-i);
			
		}
			System.out.println();
		}

	}

}
