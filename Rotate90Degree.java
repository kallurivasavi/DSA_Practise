public class Rotate90Degree {

	public static void main(String[] args) {
		 int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr.length;j++) {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 swap(arr,i,j);
			 }
		 }
		 for(int[] i:arr) {
			 rev(i);
		 }
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr.length;j++) {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }

	}

	private static void rev(int[] arr) {
		int l=0;
		int r=arr.length-1;
		while(l<r) {
			int temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			l++;r--;
		}
		
	}
	private static void swap(int[][] arr, int i, int j) {
		int temp=arr[i][j];
		arr[i][j]=arr[j][i];
		arr[j][i]=temp;
	}
}
