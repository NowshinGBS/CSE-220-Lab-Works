import java.util.*;
public class Task01 {
	public static void main(String[] args) {
		Scanner fr = new Scanner(System.in);
		int n = fr.nextInt();
		int a = 1;
		for(int i =1; i<=n; i++ ){
			a = i*a;
			System.out.println(a);	
		}
		System.out.println("\n"+a);
	}
}
