public class FindPeakElement {
	public static int findPeakElement(int[] nums) {
	       int l=0;
	       int r=nums.length-1;
	       while(l<r){
	        int mid=(l+r)/2;
	        if(nums[mid]<nums[mid+1]) l=mid+1;
	        else r=mid;
	       }
	       if(nums.length==1) return 0;
	        return l;
	    }

	public static void main(String[] args) {
		int nums[]= {1,2,3,4,3};
		int ans=findPeakElement(nums);
		System.out.println(ans);
	}
}
