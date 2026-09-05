class Solution {
    public int removeDuplicates(int[] nums) {
        int l=nums.length;
        int j=0;
        if(l==0) return 0;
        for(int i=0;i<l-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j]=nums[i];
                j++;
            }
        }
        nums[j]=nums[l-1];
        return j+1;
    }
}