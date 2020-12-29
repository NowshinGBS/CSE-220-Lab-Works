import java.util.*;
public class task02 {

	public static void main(String[] args) {
		Scanner fr = new Scanner(System.in);
		int n = fr.nextInt();
		
		System.out.println(fibonacci(n));

	}

	public static int fibonacci(int x) {
		if(x==1){
			return 1;
		}else if(x==2){
			return 1;
		}else{
			return fibonacci(x-1)+fibonacci(x-2);
		}
		
	}

}
