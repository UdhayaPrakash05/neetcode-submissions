class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen=new HashSet<>();

        int current=0;
        while(n!=1 && seen.add(n)){
            current=0;
            while(n>0){
                int num=n%10;
                current+=num*num;
                n/=10;
            }
            n=current;
        }
        return n==1;
    }
}
