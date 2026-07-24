class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0;
        int r=matrix.length;
        int c=matrix[0].length;
        int h=r*c-1;
        while(l<=h){
            int mid=(h+l)/2;
            int mid1=mid/c;
            int mid2=mid%c;
            if(matrix[mid1][mid2]==target){
                return true;
            }else if(matrix[mid1][mid2]<target){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return false;
    }
}
