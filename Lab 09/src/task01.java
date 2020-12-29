import java.util.*;
public class task01 {
//	static int ans;
	public static void main(String[] args) {
		Scanner fr = new Scanner(System.in);
		int n=fr.nextInt();
		System.out.println( factorial(n));
	}
	public static int factorial(int x) {
		
		if(x==0){
			x=1;
		}else if (x==1) {
			x=1;
		}else {	
			 x = x*factorial(x-1);
//			 System.out.println(x);
		}
		return x;
	}
}
