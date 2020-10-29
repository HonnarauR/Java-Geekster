public class Power {

	public static void main(String[] args) {
		System.out.println(PowerOf(10,4));

	}
	public static int PowerOf(int num,int pow) {
		if(pow==1) {
			return num;
		}
		if(pow%2==0) {
			int HalfRes=PowerOf(num,pow/2);
			int res=HalfRes*HalfRes;
			return res;
		}
		if(pow%2!=0) {
			int HalfRes2=PowerOf(num,pow/2);
			int res=HalfRes2*HalfRes2*num;
			return res;
			
		}
		return num;
	}

}
