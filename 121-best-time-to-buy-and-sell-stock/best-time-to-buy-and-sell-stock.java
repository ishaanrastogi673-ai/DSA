class Solution {
    public int maxProfit(int[] prices) {
        int l=prices.length;
        int maxprofit=0;
        int mini=prices[0];
        for(int i=0;i<l;i++){
            int price=prices[i]-mini;
            maxprofit=Math.max(maxprofit,price);
            mini=Math.min(mini,prices[i]);
        }
        return maxprofit;
    }
}