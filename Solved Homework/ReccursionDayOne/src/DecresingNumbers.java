public class DecresingNumbers {

	public static void main(String[] args) {
		//ner sc = new Scanner(System.in);
//int n = sc.nextInt();
//DecresingNumbersTillOne(n);
		// System.out.println(Fact(5));
//DecresingIncresing(10);
//DecresingIncresingSameNumbers(5,1);
		IncresingNumbers(10);

	}

	public static void DecresingNumbersTillOne(int num) {
		if (num == 1) {
			System.out.println(1);
			return;
		}
		System.out.println(num);
		DecresingNumbersTillOne(num - 1);
	}

	public static int Fact(int num) {
		if (num == 1) {
			return 1;
		}
		int fact = Fact(num - 1);
		int fsum = fact * num;
		return fsum;

	}

	public static void DecresingIncresing(int num) {
		if (num == 0) {
			System.out.println();
			return;
		}
		if (num % 2 == 0) {
			System.out.println("Bye\t" + num);
		}
		DecresingIncresing(num - 1);
		if (num % 2 != 0) {
			System.out.println("Hi\t" + num);
		}
	}

	public static void DecresingIncresingSameNumbers(int num, int start) {
		if (start == num + 1) {
			return;
		}
		System.out.println(start);
		start += 1;
		DecresingIncresingSameNumbers(num, start);
		System.out.println(start - 1);

	}
	public static void IncresingNumbers(int num) {
		if(num==0) {
			return;
		}
		IncresingNumbers(num-1);
		System.out.println(num);
	}
	

}
