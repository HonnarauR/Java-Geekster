import java.util.*;

public class SquareRoot {
	public static int mySqrt(int x) {
	        int low=1,high=x,ans=0;
	        
	       while(low<=high) {
	        	
	        	int mid=(low+high)/2;
	        	if((mid*mid)==x) {
	        		return mid;
	        	}
	        	else if((mid*mid)<x) {
	        		low=mid+1;
	        		ans=mid;
	        	}
	        	else {
	        		high=mid-1;
	        	}
	        }
	        
	        return ans;
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Value to find Square Root");
		int x = sc.nextInt();
		int y = mySqrt(x);
		System.out.println("Square Root = " + y);

	}

}
