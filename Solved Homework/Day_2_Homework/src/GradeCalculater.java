import java.util.Scanner;
public class GradeCalculater {

	public static void FindGrade(int total) {
		int percentage=(total*100)/300;
		
		if(percentage>=90) {
			System.out.println(" Grade \"A\" ");
		}
		else if(percentage>=80) {
			System.out.println(" Grade \"B\" ");
		}
		else if(percentage>=70) {
			System.out.println(" Grade \"C\" ");
		}
		else if(percentage>=60) {
			System.out.println(" Grade \"D\" ");
		}
		else {
			System.out.println("F");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter Marks Obtained in 3 Subjects (Max 100)");
		int total=0;
		Scanner scd=new Scanner(System.in);
	
		for(int i=0;i<3;i++) {
			
			int x=scd.nextInt();
			if(x>=0 && x<=100) {
			total=total+x;
		}
			else System.out.println("Invalid Input");
		}
		
		FindGrade(total);
	}

}
