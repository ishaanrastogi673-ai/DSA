class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int l=nums.length;
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<l;i++){
            int n=nums[i];
            if(n<min) min=n;
            if(n>max) max=n;
        }
        int[] arr=new int[max+1-min];
        for(int i=0;i<l;i++){
            arr[nums[i]-min]=1;
        }
        for(int i=0;i<max+1-min;i++){
            int o=arr[i];
            if(o==0) list.add(i+min);
        }
        return list;
    }
}