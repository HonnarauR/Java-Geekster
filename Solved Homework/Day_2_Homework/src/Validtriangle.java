import java.util.*;
public class Validtriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre 3 angles of a triangle");
		int sum=0,i=0;
		while(i<3) {
			sum+=sc.nextInt();
			i++;
		}
		if(sum==180) {
			System.out.println("Its a Valid Triangle");
		}
		else System.out.println("Its not a valid triangle");
	}

}
