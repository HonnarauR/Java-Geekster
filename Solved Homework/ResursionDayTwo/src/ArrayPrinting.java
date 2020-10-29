
public class ArrayPrinting {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// PrintArray(array, 0);
		PrintArrayReverse(array, 0);
	}

	public static void PrintArray(int[] array, int ind) {
		if (ind == array.length) {
			return;
		}
		System.out.println(array[ind]);
		PrintArray(array, ind + 1);
	}

	public static void PrintArrayReverse(int[] array, int ind) {
		if (ind == array.length-1) {
		System.out.println(array[ind]);
			return;
		}

		PrintArrayReverse(array, ind + 1);
		System.out.println(array[ind]);

	}

}
