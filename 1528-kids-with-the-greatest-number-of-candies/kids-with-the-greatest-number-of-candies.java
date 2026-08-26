class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int l=candies.length;
        int max=candies[0];
        for(int i=0;i<l;i++){
            if(candies[i]>max) max=candies[i];
        }
        ArrayList<Boolean> list=new ArrayList<>();
        for(int i=0;i<l;i++){
            if((candies[i]+extraCandies)>=max) list.add(true);
            else list.add(false);
        }
        return list;
    }
}