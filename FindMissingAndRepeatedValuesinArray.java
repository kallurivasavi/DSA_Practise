public class FindMissingAndRepeatedValuesinArray {
	public static int[] findMissingAndRepeatedValues(int[][] arr) {
        int[] ans=new int[2];
        HashSet<Integer>set=new HashSet<>();
        int row=arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(set.contains(arr[i][j])) ans[0]=arr[i][j];
                set.add(arr[i][j]);
            }
        }
        for(int i=1;i<=(row*col);i++){
            if(!set.contains(i)){
                ans[1]=i;
                break;
            }
        }
        return ans;
    }

	public static void main(String[] args) {
		int[][] arr= {{9,1,7},{8,9,2},{3,4,6}};
		int[] ans=findMissingAndRepeatedValues(arr);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
