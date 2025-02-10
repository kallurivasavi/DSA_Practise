import java.util.HashMap;

public class NextgreaterElementI {
	 public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
	        HashMap<Integer,Integer>map=new HashMap<>();
	        for(int i=0;i<nums2.length;i++){
	            int temp=nums2[i];
	            int max=Integer.MIN_VALUE;
	            boolean flag=false;
	            for(int j=i+1;j<nums2.length;j++){
	                max=Math.max(nums2[j],max);
	                if(max>temp){
	                    map.put(temp,max);
	                    flag=true;
	                    break;
	                }
	            }
	            if(flag==false) map.put(temp,-1); 
	        }
	        for(int i=0;i<nums1.length;i++){
	            nums1[i]=map.get(nums1[i]);
	        }
	        return nums1;
	    }

	public static void main(String[] args) {
		int nums1[]= {4,1,2};
		int nums2[]= {1,3,4,2};
		int ans[]=nextGreaterElement(nums1,nums2);
		System.out.print("[");
		for(int i=0;i<ans.length;i++) {
			if(i==ans.length-1)
				System.out.print(ans[i]);
			else System.out.print(ans[i]+",");
				
		}
		System.out.print("]");
	}
}
