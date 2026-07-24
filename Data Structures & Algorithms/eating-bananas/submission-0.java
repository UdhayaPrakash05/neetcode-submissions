class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int hi=0;
        for(int pi:piles){
        hi=Math.max(hi,pi);
        }
        while(l<=hi){
            int mi=l+(hi-l)/2;
            long hours=0;
            for(int hou:piles){
                hours+=(hou+mi-1)/mi;
            }
            if(hours<=h){
                hi=mi-1;
            }else{
                l=mi+1;
            }
        }
        return l;
    }
}
