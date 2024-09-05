public class Leaders {
	public static void leaders(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=arr.length-1;i>0;i--) {
			if(arr[i]>max) {
				max=arr[i];
				System.out.print(max+" ");
			}
		}
	}
	public static void main(String[] args) {
          int[] arr= {16, 17, 4, 3, 5, 2};
          leaders(arr);
	}
}
