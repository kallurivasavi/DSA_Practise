class MaxNoOfWordsSentence {
    public int mostWordsFound(String[] sent) {
        int max=0;
        for(int i=0;i<sent.length;i++){
            int len=sent[i].split(" ").length;
            max=Math.max(max,len);
        }
        return max;
    }
}
