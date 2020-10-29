import java.util.*;
public class InssertionSort {

	public static void main(String[] args) {
		int[] arr=new int[] {4,6,2,4,9,1,5};
		
		for(int i=1;i<arr.length;i++) {
			int j=i;
			while(j!=0 && arr[j]<arr[j-1]) {
				arr[j]+=arr[j-1];
				arr[j-1]=arr[j]-arr[j-1];
				arr[j]-=arr[j-1];
				j--;
			}
		}
		for(int ele : arr) {
			System.out.println(ele);
		}

	}

}
