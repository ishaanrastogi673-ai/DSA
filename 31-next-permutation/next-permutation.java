class Solution {
    public void nextPermutation(int[] nums) {
        int l=nums.length;
        int ind=-1;
        if(l==1) return;
        for(int i=l-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            for(int i=0;i<l/2;i++){
                int temp=nums[i];
                nums[i]=nums[l-1-i];
                nums[l-1-i]=temp;
            }
            return;
        }
        for(int i=l-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                int n=nums[i];
                nums[i]=nums[ind];
                nums[ind]=n;
                break;
            }
        }
        int p=1;
        for(int i=ind+1;i<((l-ind+1)/2)+ind;i++){
            int m=nums[i];
            nums[i]=nums[l-p];
            nums[l-p]=m;
            p++;
        }
        return ;
    }
}