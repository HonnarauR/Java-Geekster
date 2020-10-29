public class FindingNumberInArray {

	public static void main(String[] args) {
		int[] array = new int[] { 10, 9, 5, 1, 7, 12, 5, 2, 6, 10, 7, 9, 5 };
		System.out.println(FindElementInArray(array, 7, 0, 0));
		//System.out.println(MaxOf(array, 0));
	}

	public static int FindElementInArray(int[] array, int ele, int indx, int count) {
		if (indx == array.length) {
			return count;
		}

		if (array[indx] == ele) {
			count++;
		}
		int finalCount = FindElementInArray(array, ele, indx + 1, count);
		return finalCount;
	}


}
