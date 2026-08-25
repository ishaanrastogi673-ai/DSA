class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l=nums.length;
        int arr[]=new int[l];
        int i=0,j=1;
        for(int z=0;z<l;z++){
            if(z<n){
                arr[i]=nums[z];
                i=i+2;
            }
            else{
                arr[j]=nums[z];
                j=j+2;
            }
        }
        return arr;
    }
}