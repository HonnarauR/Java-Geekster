import java.util.*;
public class FactorialValueOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int factorial=num;
	for(int i=1;i<num;i++) {
		factorial=factorial*i;
		
	}
		System.out.println(factorial);

	}

}
