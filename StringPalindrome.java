String s="radar";
int l=0;
int r=s.length()-1;
while(l<r){
    if(s.charAt(l)!=s.charAt(r)){
        System.out.println("The given String "+s+" is not an Palindrome.");
        System.exit(0);
    }else{
        l++;
        r--;
     }
}
System.out.println("The given String "+s+" is an Palindrome.");
