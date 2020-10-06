import java.util.Scanner;
public class SmallestAndLargest {
	
	public static void Largest(int arr[]) {
		int array[]=arr;
		int large=array[0];
		
		for(int i=1;i<array.length;i++) {
			if(array[i]>array[i-1]) {
				large=array[i];
			}
		}
		System.out.println("Largest = "+large);
	}
	
	public static void Smallest(int arr[]) {
		int array[]=arr;
		int small=array[0];
		
		for(int i=1;i<array.length;i++) {
			if(array[i]<array[i-1]) {
				small=array[i];
			}
	}
		System.out.println("Smallest = "+small);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elemens you like to input");
		 int n=sc.nextInt();
		 
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 Largest(arr);
		 Smallest(arr);

	}

}
