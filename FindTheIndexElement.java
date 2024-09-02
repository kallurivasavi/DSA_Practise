public class FindTheIndexElement {
	public static int index(int a[],int value) {
	  	for(int i=0;i<a.length;i++) {
	  		if(a[i]==value) {
	  			return i;
	  		}
	  	}
	  	return -1;
	}

	public static void main(String[] args) {
		int a[]= {3,5,7,9,1,5};
         int ans=index(a,5);
         System.out.println(ans);
	}
}
