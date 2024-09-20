public class ProductArrayExceptSelf {
   public static int[] product(int a[]) {
        int ans[]=new int[a.length];
        int lp=1;
        int i=0;
        while(i<a.length) {
        	ans[i]=lp;
        	lp=lp*a[i];
        	i++;
        }
        System.out.println();
        int rp=1;
        int j=ans.length-1;
		while(j>=0) {
		ans[j]=ans[j]*rp;
		rp=rp*a[j];
		j--;
		}
		return ans;
     }
public static void main(String[] args) {
          int a[]= {1,2,3,4};
          int ans[]=product(a);
          for(int i=0;i<ans.length;i++) {
           	  System.out.print(ans[i]+" ");
             }
          
	}

}
