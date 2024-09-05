public class SecondLargestAndSecondSmallest {

	public static void main(String[] args) {
		int a[]= {2,5,4,7,22,51,1,6};
		int min=Integer.MAX_VALUE;
		int secmin=min;
		int max=Integer.MIN_VALUE;
		int secmax=max;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				secmax=max;
			    max=a[i];
			}else if(a[i]>secmax){
				secmax=a[i];
			}
		}
			for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				secmin=min;
			    min=a[i];
			}else if(a[i]<secmin){
				secmin=a[i];
			}
		}
		System.out.println(secmax+" "+secmin);
	}

}
