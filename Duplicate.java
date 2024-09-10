public class Duplicate {
	public static int findDuplicate(int[] arr) {
        Set<Integer>set=new HashSet<>();
        for(int i:arr){
           if(!set.contains(i)) {
            set.add(i);
           } else return i;
        }
        return -1;  
    }

	public static void main(String[] args) {
		int[] arr= {1,3,4,2,2};
		int ans=findDuplicate(arr);
		System.out.println(ans);

	}

}
