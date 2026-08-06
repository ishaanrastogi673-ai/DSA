class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l=nums.length;
        int[] arr=new int[l];
        int pi=0;
        int ni=1;
        for(int i=0;i<l;i++){
            int n=nums[i];
            if(n>0) {arr[pi]=n;pi=pi+2;}
            else {arr[ni]=n;ni=ni+2;}
        }
        return arr;
    }
}