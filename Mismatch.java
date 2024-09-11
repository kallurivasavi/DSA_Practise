public class Mismatch {
	 public static int[] findErrorNums(int[] arr) {
	        Set<Integer>set=new HashSet<>();
	        int ans[]=new int[2];
		    for(int i:arr){
		        if(set.contains(i)){
		               ans[0]=i;
		        }
	            set.add(i);
		    }
	        for(int i=1;i<=arr.length;i++){
	            if(!set.contains(i)){
	                ans[1]=i;
	            }
	        }
		    return ans; 
	    }
	public static void main(String[] args) {
		int arr[]={1,1};
		int ans[]=findErrorNums(arr);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
