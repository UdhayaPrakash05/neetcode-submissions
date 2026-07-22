class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsu=nums[0];
        int cur=0;
        int minsu=nums[0];
        int curr=0;
        int tot=0;
        for(int num:nums){
            cur=Math.max(num,cur+num);
            maxsu=Math.max(cur,maxsu);

            curr=Math.min(num,curr+num);
            minsu=Math.min(curr,minsu);

            tot+=num;

        }
        if(maxsu<0){
            return maxsu;
        }
        return Math.max(maxsu,tot-minsu);
    }
}