public class BestTimeToSell {
      public static void sell(int[] arr) {
    	  int profit=0;
    	  int min=arr[0];
    	  for(int i=1;i<arr.length;i++) {
    		  int cost=arr[i]-min;
    		  profit=Math.max(profit, cost);
    		  min=Math.min(arr[i], min);
    	  }
    	  System.out.println(profit+" ");
      }
	public static void main(String[] args) {
        int[] arr= {7,1,5,3,6,4};
        sell(arr);
	}
}
