public class MostFrequentEvenElement {
	public static int mostFrequentEven(int[] arr) {
		int max=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]%2==0) {
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
                max=Math.max(max,map.get(arr[i]));
            }
        }
        if(max==0) return -1; 
        int ans=Integer.MAX_VALUE;
        for(int i:map.keySet()){
            if(map.get(i)==max){
                ans=Math.min(ans,i);
            }
        }
        return ans;
    }
	
	public static void main(String[] args) {
		int[] arr= {0,1,2,2,4,4,1};
		int ans=mostFrequentEven(arr);
		System.out.println(ans);
	}
}
