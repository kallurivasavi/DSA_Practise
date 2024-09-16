public class RearrangeByElementSign {
	public static int[] rearrangeArray(int[] arr) {
        int[] pos=new int[arr.length/2];
        int[] neg=new int[arr.length/2];
        int l=0;int r=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                pos[l++]=arr[i]; 
            }else if(arr[i]<0){
                neg[r++]=arr[i];
            }
        }
        int n=0;l=0;r=0;
        while(l<pos.length && r<neg.length){
            arr[n++]=pos[l++];
            arr[n++]=neg[r++];
        }
        return arr;
    }

	public static void main(String[] args) {
		int arr[]= {3,1,-2,-5,2,-4};
		int ans[]=rearrangeArray(arr);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}

	}

}
