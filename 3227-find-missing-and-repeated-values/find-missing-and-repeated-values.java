class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int z=grid[i][j];
                if(!map.containsKey(z)) map.put(z,1);
                else map.put(z,map.get(z)+1);
            }
        }
        int[] ans=new int[2];
        int l=m*n;
        for(int i=1;i<=l;i++){
            if(map.containsKey(i)){
                if(map.get(i)==2) ans[0]=i;
            }
            else ans[1]=i;
        }
        return ans;
    }
}