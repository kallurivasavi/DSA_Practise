public class UniqueOccurences {
	public static boolean unique(int[] arr) {
		Map<Integer,Integer>map=new HashMap<>();
		Set<Integer>set=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		for(int i:map.values()) {
			if(!set.contains(i)) set.add(i);
			else return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,2,1,1,3};
		System.out.println(unique(arr));
	}
}
