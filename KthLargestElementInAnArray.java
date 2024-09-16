public class KthLargestElementInAnArray {
	public static int kLargest(int[] arr,int k) {
		Arrays.sort(arr);
		return arr[arr.length-k];
	}

	public static void main(String[] args) {
		int[] arr= {3,2,3,1,2,4,5,5,6};
		int ans=kLargest(arr,4);
		System.out.println(ans);
	}
}
