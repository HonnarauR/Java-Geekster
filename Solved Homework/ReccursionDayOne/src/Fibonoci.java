public class Fibonoci {

	public static void main(String[] args) {
		//Fibonoci f=new Fibonoci();
		System.out.println(Fibo(8));

	}
	public static int Fibo(int n) {
//		int f0=0;
//		int f1=1;
//		System.out.println(f0);
//		System.out.println(f1);
//		for(int i=0;i<n-2;i++) {
//			int out=f0+f1;
//			System.out.println(out);
//			f0=f1;
//			f1=out;
//		}
		if(n==1) {
			return 0;
		}
		if(n==2) {
			return 1;
		}
		
	int	f1=Fibo(n-1);
	int	f2=Fibo(n-2);
		
		int res=f1+f2;
	System.out.println(res);
		return(res);
	}

}
