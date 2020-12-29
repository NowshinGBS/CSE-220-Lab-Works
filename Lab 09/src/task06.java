import java.util.Scanner;
public class task06 {
	public static void main(String[] args) {
		Scanner fr = new Scanner(System.in);
		int m = fr.nextInt();
		int n = fr.nextInt();
		System.out.print(power(m,n));
	}
	public static int power(int x, int y) {
		if(y==0){
			return 1;
		}else if (y==1) {
			return x;
		}else {
			return x*power(x, y-1);
		}
	}
}
