import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 12, 9, 21, 63, 23, 44 };

		int temp;
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i] + arr[j];
					arr[i] = temp - arr[i];
					arr[j] = temp - arr[i];
				}
			}

		}
		for (int ele : arr) {
			System.out.println(ele);
		}

	}
}
