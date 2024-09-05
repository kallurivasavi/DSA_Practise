import java.util.*;
import java.util.Map.Entry;
public class MajorityElement {
 public static void main(String[] args) {
		int[] arr={2,2,1,1,1,2,2};
    Map<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		for(Map.Entry<Integer,Integer>mp:map.entrySet()) {
			if(mp.getValue()>arr.length/2) {
				System.out.println(mp.getKey());
			}
		}
		
	}
}
