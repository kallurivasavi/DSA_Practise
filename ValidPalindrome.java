public class ValidPalindrome {
	    public static boolean isPalindrome(String s) {
	        s=s.trim();
	        s=s.toLowerCase();
	        String ans=s.replaceAll("[^A-Za-z0-9]","");
	        int i=0;
	        int j=ans.length()-1;
	        while(i<j){
	            if(ans.charAt(i)!=ans.charAt(j)) return false;
	                i++;
	                j--;
	        }
	        return true;
	    }

	public static void main(String[] args) {
        String s= "race a car";
        System.out.println(isPalindrome(s));
	}

}
