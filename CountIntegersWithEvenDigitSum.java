public class CountIntegersWithEvenDigitSum {
	public static int countEven(int n) {
        int cnt=0;
        for(int i=1;i<=n;i++){
            int sum=0;
            int n1=i;
            while(n1>0){
                int r=n1%10;
                sum=sum+r;
                n1=n1/10;
            }
            if(sum%2==0){
                cnt++;
            }
        }
        return cnt;
    }
	public static void main(String[] args) {
		int n=30;
		int ans=countEven(n);
		System.out.println(ans);
	}

}
