class Solution {
    public int missingNumber(int[] nums) {
        int n=0;
        int ne=nums.length;
        for(int i=1;i<=ne;i++){
            n^=i;
        }
        for(int num:nums){
            n^=num;
        }
        return n;
    }
}
