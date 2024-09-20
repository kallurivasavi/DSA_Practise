public class StrongNumber {
	static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int n=145;
		int sum=0;
		int temp=n;
		while(temp>0) {
			int r=temp%10;
			sum=sum+fact(r);
			temp=temp/10;
		}
		if(sum==n) System.out.println(true);
		else System.out.println(false);
	}

}
