

public class firstAccourence {

	public static void main(String[] args) {
		int[] array = new int[] { 3, 5, 6, 3, 3, 3, 4, 1, 3, 4 };
		// System.out.println(FirstOccerence(array, 3, 0));
		System.out.println(LastOccerence(array, 3, array.length - 1));
	}

	public static int FirstOccerence(int[] array, int num, int indx) {
		if (indx == array.length) {
			return -1;
		}

		if (array[indx] == num) {
			return indx;
		}
		int finalindx = FirstOccerence(array, num, indx + 1);
		return finalindx;
	}

	public static int LastOccerence(int[] array, int num, int indx) {

		if (indx < 0) {
			return -1;
		}
		if (array[indx] == num) {
			return indx;
		}
		int found = LastOccerence(array, num, indx - 1);

		return found;
	}
}
