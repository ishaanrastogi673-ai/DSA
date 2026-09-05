class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k>0){
            int minidx=MIN(nums);
            nums[minidx]=nums[minidx]*multiplier;
            k--;
        }
        return nums;
    }
    int MIN(int[] arr){
        int min=arr[0];
        int idx=0;
        int l=arr.length;
        for(int i=0;i<l;i++){
            if(arr[i]<min) {
                min=arr[i];
                idx=i;
            }
        }
        return idx;
    }
}