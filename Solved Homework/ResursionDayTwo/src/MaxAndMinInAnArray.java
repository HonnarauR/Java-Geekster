
public class MaxAndMinInAnArray {

	public static void main(String[] args) {
		int[] array = new int[] { 3, 5, 6, 3, 3, 3, 4, 1, 3, 4 };
		System.out.println("Max = " + MaxOf(array, 0));
		System.out.println("Min = " + MinOf(array, 0));

	}

	public static int MaxOf(int[] array, int indx) {
		if (indx == array.length - 1) {
			return array[indx];
		}

		int maxRest = MaxOf(array, indx + 1);
		if (maxRest > array[indx]) {
			return maxRest;
		} else
			return array[indx];
	}

	public static int MinOf(int[] array, int indx) {
		if (array.length - 1 == indx) {
			return array[indx];
		}

		int RestMin = MinOf(array, indx + 1);
		if (RestMin < array[indx]) {
			int min = RestMin;
			return min;
		} else
			return array[indx];
	}

}
