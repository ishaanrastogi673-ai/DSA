class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int l=nums.length;
        if(l==0) return 0;
        int longest=1;
        for(int i=0;i<l;i++){
            int m=nums[i];
            set.add(m);
        }
        for(int i:set){
            if(!set.contains(i-1)){
                int x=i;
                int count=1;
                while(set.contains(x + 1)) {x++;count++;}
                longest=Math.max(longest,count);
            } 
        }
        return longest;
    }
}