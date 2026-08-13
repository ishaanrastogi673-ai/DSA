class Solution {
    public String largestOddNumber(String num) {
        int l=num.length();
        int ind=0;
        for(int i=l-1;i>=0;i--){
            int n=num.charAt(i)-'0';
            if(n%2!=0) return num.substring(0,i+1);
        }
        return "";
    }
}