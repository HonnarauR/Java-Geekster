import java.util.*;
public class MeaningOfGrade {
	public static void Grading(char grade) {
		if(grade=='a' || grade=='A') {
			System.out.println("Excellent");
		}
		else if(grade=='b'||grade=='B') {
			System.out.println("Good");
		}
		else if(grade=='c'||grade=='C') {
			System.out.println("Average");
		}
		else if(grade=='d'||grade=='D') {
			System.out.println("Dificient");
		}
		else if(grade=='f'||grade=='F') {
			System.out.println("Failing");
		}
		else System.out.println("Invalid Grade");
	}
	
	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
	System.out.println("Entre the grade to Know its Meaning");
	char grade=sn.next().charAt(0);
	
	Grading(grade);


}
}
