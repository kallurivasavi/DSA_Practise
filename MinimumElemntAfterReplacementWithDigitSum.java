public class MinimumElemntAfterReplacementWithDigitSum {
	public static  int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;;
        for(int n:nums){
            min=Math.min(min,number(n));
        }
        return min;
    }
    public static int number(int n){
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
    
	public static void main(String[] args) {
		int nums[]= {10,12,13,14};
		int ans=minElement(nums);
		System.out.println(ans);
	}
}
