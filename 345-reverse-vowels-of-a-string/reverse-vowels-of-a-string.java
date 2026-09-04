class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        int l=sb.length();
        int i=0;
        int j=l-1;
        while(i<j){
            char ch1=sb.charAt(i);
            char ch2=sb.charAt(j);
            if(isVol(ch1)==true && isVol(ch2)==false) j--;
            else if(isVol(ch1)==false && isVol(ch2)==true) i++;
            else if(isVol(ch1)==false && isVol(ch2)==false) {i++;j--;}
            else {
                char cc=sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j));
                sb.setCharAt(j,cc);
                i++;
                j--;
            }
        }
        return sb.toString();
    }
    boolean isVol(Character ch){
        Character[] arr={'a','e','i','o','u','A','E','I','O','U',};
        for(char cc:arr){
            if(ch==cc) return true;
        }
        return false;
    }
}