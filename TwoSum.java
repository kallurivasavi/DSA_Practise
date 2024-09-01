import java.util.*;
class TwoSum {
    public static int[] twoSum(int[] arr, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        int ans[]=new int[2];
        for(int i=0;i<arr.length;i++){
          int ele=k-arr[i];
          if(map.containsKey(ele)){
            ans[0]=map.get(ele);
            ans[1]=i;
            return ans;
          }
          map.put(arr[i],i);
        }
        return ans;
    }
  public static void main(String args[]){
    int arr[]={2,4,6,8,10};
    int b[]=twoSum(arr,8);
    for(int i=0;i<b.length;i++){
         System.out.println(b[i]+" ");
    }
  }
}
