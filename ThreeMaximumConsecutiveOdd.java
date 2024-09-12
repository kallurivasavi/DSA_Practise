public class ThreeMaximumConsecutiveOdd {
	public static void main(String[] args) {
	   int arr[]= {1,2,34,3,4,5,7};
	   int cnt=0;
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i]%2!=0) {
			   cnt++;
		   }else{
			   cnt=0;
		   }
		   if(cnt==3) {
			   System.out.println(true);
		   }
	   } 
	   if(cnt!=3) {
		   System.out.println(false);
	   }
	}
}
