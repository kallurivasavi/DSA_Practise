public class MinimumNumberOfAGame {
	public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int j=1;
        while(j<nums.length){
            int Alice=nums[j--];
            int Bob=nums[j++];
            nums[j--]=Bob;
            nums[j++]=Alice;
            j=j+2;
        }
        return nums;
    }

	public static void main(String[] args) {
		int[] nums= {5,4,2,3};
		int[] ans=numberGame(nums);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}

	}

}
