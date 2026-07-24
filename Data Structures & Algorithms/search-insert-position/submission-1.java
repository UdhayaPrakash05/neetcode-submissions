class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length-1;
         for(int i=0;i<=n;i++){
            if(target==nums[i]){
                return i;
            }else if(target<nums[i]){
                return i;
            }else if(target>nums[i]&&i==n){
                return i+1;
            }
         }
         return -1;
    }
}