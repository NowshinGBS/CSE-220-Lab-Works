
public class task08 {

	public static void main(String[] args) {
		int [] a = {22, 34, 12, 8, 78, 24, 67};
		int[] b =sorting(a, 0);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

public static int[] sorting(int[] data, int initialValue){
		
		int temp;
		
		for(int i=1; i<data.length; i++){
			if(data[i-1]>data[i]){
				temp = data[i-1];
				data[i-1]= data [i];
				data[i] = temp;
			}
		}
		if(initialValue<data.length){
			sorting(data, ++initialValue);
		}
		return data;
	}
	
}