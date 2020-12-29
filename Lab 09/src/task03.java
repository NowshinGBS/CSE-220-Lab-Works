public class task03 {
	public static void main(String[] args) {
		int [] a = {11, 22, 24, 36, 44, 52, 55, 69, 74};
		System.out.println(BinarySearch(a, 9, 0, 8, 74));

	}

	public static int BinarySearch(int[] a, int size, int left, int right, int key){
		int pos;
		int mid = (left+right)/2;
		if(left>right){
		return -1;
	}
	if(key==(a[mid])){
		return mid;
	}else if(key>a[mid]){
		pos = BinarySearch(a, size, (mid+1), right, key);
	}else {
		pos = BinarySearch(a, size, left, (mid-1), key);
	}
	return pos;
	}
}