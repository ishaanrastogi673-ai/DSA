class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=nums.length;
        int[] ss=new int[l];
        for(int k=0;k<l;k++){
            ss[k]=nums[k];
        }
        Arrays.sort(nums);
        int i=0;
        int j=l-1;
        int fir=0;
        int sec=0;
        while(i<j){
            int n1=nums[i];
            int n2=nums[j];
            if((n1+n2)>target) j--;
            else if((n1+n2)<target) i++;
            else {fir=n1;sec=n2;break;}
        }
        int[] arr=new int[2];
        int z=0;
        for(int k=0;k<l;k++){
            int nn=ss[k];
            if(nn==fir || nn==sec) {arr[z]=k;z++;}
        }
        return arr;
    }
}