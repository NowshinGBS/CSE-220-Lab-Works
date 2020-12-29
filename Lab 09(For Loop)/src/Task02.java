import java.util.*;
public class Task02 {

	public static void main(String[] args) {
		Scanner fr = new Scanner(System.in);
		int n = fr.nextInt();
		int firstNum = 0;
		int secondNum =1;
		
		for(int i=1; i<=n; i++ ){
			int thirdNum = firstNum+secondNum;
			System.out.println(thirdNum);
			firstNum = secondNum;
			secondNum = thirdNum;
		}

	}

}
