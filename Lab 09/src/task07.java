import java.util.Scanner;
public class task07 {

	public static void main(String[] args) {
		Scanner fr = new Scanner(System.in);
		int m = fr.nextInt();
		int n = fr.nextInt();
		System.out.println(power(m,n));
	}

	public static int power(int x, int y) {
		if(y%2==0){
		if(y==0){
			return 1;
		}else if (y==1) {
			return x;
			}else {
				y=y/2;
				return x*power(x, y-1)*x*power(x, y-1);
			}
	    }else{
	    	if(y==1){
	    		return x;
	    	}else{
				y=y/2;
				return x*power(x, y-1)*x*power(x, y-1)*x;
			}
	    }
	}
}
