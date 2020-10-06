import java.util.*;
public class SumOfNaturalNumber {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int sum=0;
 for(int i=1;i<=num;i++) {
	 sum+=i;
 }
 System.out.println(sum);
	}

}
