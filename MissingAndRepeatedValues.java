import java.util.*;
public class MissingAndRepeatedValues {
	public static void missAndRepeat(int[] arr,int n) {
		int repeat=-1;
		int sum=0;
		int actualSum=0;
		int expectedsum=n*(n-1)/2;
		Set<Integer>set=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(set.contains(arr[i])) {
				repeat=arr[i];
			}else {
				set.add(arr[i]);
			}
			actualSum+=arr[i];
			sum=expectedsum-(actualSum-repeat);
		}
		System.out.println("Missing Number:"+sum);
		System.out.println("Repeating Number:"+repeat);
	}

	public static void main(String[] args) {
	int[] arr= {3,3,1,0};
    missAndRepeat(arr,4);
	}
}
