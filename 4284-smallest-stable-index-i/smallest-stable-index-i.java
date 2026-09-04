class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int l=nums.length;
        for(int i=0;i<l;i++){
            int max=MAX(nums,0,i);
            int min=MIN(nums,i,l-1);
            if((max-min)<=k) return i;
        }
        return -1;
    }
    int MAX(int[] arr,int strt,int end){
        int max=arr[strt];
        for(int i=strt;i<=end;i++){
            int n=arr[i];
            if(n>max) max=n;
        }
        return max;
    }
    int MIN(int[] arr,int strt,int end){
        int min=arr[strt];
        for(int i=strt;i<=end;i++){
            int n=arr[i];
            if(n<min) min=n;
        }
        return min;
    }
}