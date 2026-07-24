class Solution {
    public int mySqrt(int x) {
        int l=1;
        int h=x;
        int a=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            long ll=(long)mid*mid;
            if(ll==x){
                return mid;
            }else if(ll<x){
                a=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return a;
    }
}