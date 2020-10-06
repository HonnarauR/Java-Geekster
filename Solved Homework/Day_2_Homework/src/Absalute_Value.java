import java.util.Scanner;
public class Absalute_Value {

	public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	if(number<0) {
		number=number*(-1);
	}
	System.out.println(number);
	}

}
