public class MaximumNoOfWordsFoundInASentence {
	public static int mostWordsFound(String[] sentences) {
	       int max=0;
	       for(int i=0;i<sentences.length;i++){
	          String str=sentences[i];
	          int cnt=0;
	          for(int j=0;j<str.length();j++){
	              if(str.charAt(j)==' ') cnt++;
	              max=Math.max(cnt,max);
	          }
	       }
	       return max+1; 
	    }

	public static void main(String[] args) {
		String[] sentences={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		int ans=mostWordsFound(sentences);
		System.out.println(ans);
	}

}
