import java.util.ArrayList;
import java.util.List;

public class FindThePeaks {
	public static List<Integer> findPeaks(int[] arr) {
        List<Integer>list=new ArrayList<>();
        if(arr.length==1){
            return list;
        }
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                list.add(i);
            }
        }
        return list;
    }

	public static void main(String[] args) {
		int arr[]= {2,4,4};
		List<Integer>list=findPeaks(arr);
		System.out.println(list);

	}
}
