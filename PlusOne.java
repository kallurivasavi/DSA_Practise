public class PlusOne {
	 public static int[] plusOne(int[] arr) {
		 for(int i=arr.length-1;i>=0;i--){
			 if (arr[i]!=9) {
				 arr[i]++;
				 return arr;
			 }
			 arr[i]=0;
		 }
		 int[] ans=new int[arr.length+1];
		 ans[0]=1;
		 return ans;
	 }

	public static void main(String[] args){
		int[] digits= {1,2,9};
		int[] ans=plusOne(digits);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
