public class StringReverse{
     public static void main(String args[]){
          String s="xyz";
          String ans="";
          for(int i=s.length()-1;i>=0;i--){
               ans=ans+s.charAt(i);
          }
          System.out.println(ans);
     }
}
