class Solution {
    public int maxSubArray(int[] nums) {
        int maxsu=nums[0];
        int cur=nums[0];
        for(int i=1;i<nums.length;i++){
            cur=Math.max(nums[i],nums[i]+cur);
            maxsu=Math.max(maxsu,cur);
        }
        return maxsu;
    }
}
