import java.util.*;

public class TraversingIn2DBoard {

	public static void main(String[] args) {
		// System.out.println(PrintAllPaths(3, 4, 1, 1));
		//PathsWithOutDia(3, 4, 1, 1, "");
		PathsWithpartialDia(3, 4, 1, 1, "");
	}

	public static ArrayList<String> PrintAllPaths(int endrow, int endcol, int row, int col) {
		if (row == endrow && col == endcol) {
			ArrayList<String> temp = new ArrayList<>();
			temp.add("");
			return temp;
		}
		if (row > endrow || col > endcol) {
			ArrayList<String> temp2 = new ArrayList<>();
			return temp2;
		}

		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rr = PrintAllPaths(endrow, endcol, row + 1, col);
		for (String ele : rr) {
			mr.add("V" + ele);
		}

		rr = PrintAllPaths(endrow, endcol, row, col + 1);
		for (String ele : rr) {
			mr.add("H" + ele);
		}

		rr = PrintAllPaths(endrow, endcol, row + 1, col + 1);
		for (String ele : rr) {
			mr.add("D" + ele);
		}
		return mr;
	}

	public static void PathsWithOutDia(int endrow, int endcol, int row, int col, String ans) {
		if (row == endrow && col == endcol) {
			System.out.println(ans);
			return;
		}
		if (row > endrow || col > endcol) {
			return;
		}
		PathsWithOutDia(endrow, endcol, row + 1, col, ans + "V");
		PathsWithOutDia(endrow, endcol, row, col + 1, ans + "H");

	}

	public static void PathsWithpartialDia(int endrow, int endcol, int row, int col, String ans) {
		if (row == endrow && col == endcol) {
			System.out.println(ans);
			return;
		}
		if (row > endrow || col > endcol) {
			return;
		}
		PathsWithpartialDia(endrow, endcol, row + 1, col, ans + "V");
		PathsWithpartialDia(endrow, endcol, row, col + 1, ans + "H");
		
		if (ans.length() != 0 && ans.charAt(ans.length() - 1) != 'D') {
			PathsWithpartialDia(endrow, endcol, row + 1, col + 1, ans + "D");
		}
	}
}
