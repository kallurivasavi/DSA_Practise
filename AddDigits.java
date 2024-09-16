public class AddDigits {
	public static int addDigits(int n) {
        while(n>9){
            int sum=0;
            while(n!=0){
                int r=n%10;
                sum=sum+r;
                n=n/10;
            }
            n=sum;
        }
        if(n<10) return n;
        return n;
    }

	public static void main(String[] args) {
		int n=38;
		int ans=addDigits(n);
		System.out.println(ans);
	}

}
