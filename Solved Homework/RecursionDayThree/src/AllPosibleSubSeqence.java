import java.util.*;

public class AllPosibleSubSeqence {

	public static void main(String[] args) {
	//	int[] array = { 1, 2, 3 };
		//heapPermutation(array, array.length);
		// PosibleSubSequenceOfArray(array, "", 0);
	int[] apple =new int[] {2};
	
	int []orange=new int[] {-2};
		countApplesAndOranges(2,3,1,5,apple,orange);
	}

	public static void heapPermutation(int[] array, int size) {
		if (size == 1) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j] + " ");

			}
			System.out.println();
		}

		for (int i = 0; i < size; i++) {
			heapPermutation(array, size - 1);

			if (size % 2 != 0) {
				int temp = array[0];
				array[0] = array[size - 1];
				array[size - 1] = temp;
			} else {
				int temp = array[i];
				array[i] = array[size - 1];
				array[size - 1] = temp;
			}

		}
	}

	public static void PosibleSubSequenceOfArray(int[] array, String ans, int indx) {
		if (indx == array.length) {
			System.out.println(ans);
		}

		PosibleSubSequenceOfArray(array, ans + array[indx] + " ", indx + 1);
		PosibleSubSequenceOfArray(array, ans, indx + 1);
	}

	////////////////////////////////////////////////////////////////////////////////////
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int countApp = 0;
		int countOr = 0;
		for (int i = 0; i < apples.length; i++) {

			if ((apples[i] + a) >= s && (apples[i] + a) <= t) {
				countApp++;
			}
		}
		for (int i = 0; i < oranges.length; i++) {
			if ((oranges[i] + b) >= s && (oranges[i] + b) <= t) {
				countOr++;
			}
		}
		System.out.println(countApp);
		System.out.println(countOr);
	}
}
