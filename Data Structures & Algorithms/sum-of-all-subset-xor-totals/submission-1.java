class Solution {
    public int subsetXORSum(int[] nums) {
        int sum=0;
        for(int mu:nums){
            sum|=mu;
        }
        return sum<<nums.length-1;
    }
}