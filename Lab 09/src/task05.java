import  java.util.*;
public class task05 {
	public static void main(String[] args) {
		Scanner fr = new Scanner(System.in);
		int a = fr.nextInt();
		int b = fr.nextInt();
		gcd(a, b);

	}
	public static void gcd(int n, int m){
		if(m==0){
			System.out.print(n);
			return;
		}else if (m>n) {
			gcd(m, n);
		}else {
			gcd(m, n%m);
		}
	}

}
