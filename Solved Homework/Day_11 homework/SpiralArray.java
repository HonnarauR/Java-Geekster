import java.util.Scanner;

public class SpiralArray {
	public static void Spiral(int[][] arr) { 
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==0) {
					System.out.println(arr[i][j]);
				}
				if(j==arr.length-i) {
					System.out.println(arr[j][i]);
				}
			
	}
		}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr2=new int[4][4];
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				arr2[i][j]=sc.nextInt();
				
			}
			
		}
		
		Spiral(arr2);



	}

}
