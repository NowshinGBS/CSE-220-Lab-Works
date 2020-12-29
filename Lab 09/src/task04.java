import java.util.*;
public class task04 {
	public static void main(String[] args) {
		Scanner  fr = new Scanner(System.in);
		int a = fr.nextInt();
		DecimalToBinary(a);
	}

	public static void DecimalToBinary(int x) {
		if(x==0){
			System.out.print(0);
			return;
		}
			DecimalToBinary(x/2);
			System.out.print(x%2);
		}
	}

