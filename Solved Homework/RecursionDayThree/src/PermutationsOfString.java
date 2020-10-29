import java.util.*;

public class PermutationsOfString {

	public static void main(String[] args) {
		String str = "ABC";
		System.out.println(stringPermutations(str));

		stringPermutationsDev(str, "");
	}

	public static ArrayList<String> stringPermutations(String str) {

		if (str.length() == 0) {
			ArrayList<String> temp = new ArrayList<>();
			temp.add(" ");
			return temp;
		}
		char c = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = stringPermutations(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String s : rr) {
			for (int i = 0; i < s.length(); i++) {
				String pre = s.substring(0, i);
				String post = s.substring(i);
				mr.add(pre + c + post);
			}

		}
		return mr;

	}

	public static void stringPermutationsDev(String qes, String ans) {
		if (qes.equals("")) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < qes.length(); i++) {

			String newqes = qes.substring(0, i) + qes.substring(i + 1);
			String newans = ans + qes.charAt(i);
			stringPermutationsDev(newqes, newans);

		}
	}
}