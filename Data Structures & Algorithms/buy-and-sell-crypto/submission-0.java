class Solution {
    public int maxProfit(int[] prices) {
        int minn=prices[0];
        int maxx=0;
        for(int i=1;i<prices.length;i++){
            minn=Math.min(minn,prices[i]);
            maxx=Math.max(maxx,prices[i]-minn);
        }
        return maxx;
    }
}
