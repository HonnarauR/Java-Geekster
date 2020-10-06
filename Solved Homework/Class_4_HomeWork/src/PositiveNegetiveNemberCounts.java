import java.util.Scanner;


public class PositiveNegetiveNemberCounts {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of elements ");
		int n=sc.nextInt();
		int positiveCount=0;
		int negetiveCount=0;
		int zeroCount=0;
		
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			if(x==0) {
				zeroCount++;
			}
			else if(x<0) {
				negetiveCount++;
			}
			else positiveCount++;
		}
		
		System.out.println("Positive Numbers "+positiveCount);
		System.out.println("Negetive Numbers "+negetiveCount);
		System.out.println("Zeros "+zeroCount);

	}

}
