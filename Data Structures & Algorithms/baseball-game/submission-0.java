class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        int a=0,b=0;
        for(String op: operations){
            if(op.equals("+")){
                a=s.pop();
                b=s.peek();
                s.push(a);
                s.push(a+b);
            }else if(op.equals("C")){
                s.pop();
            }else if(op.equals("D")){
                a=s.peek();
                s.push(a*2);
            }else{
                s.push(Integer.parseInt(op));
            }
        }
        int sum=0;
        for(int xx:s){
            sum+=xx;
        }
        return sum;
    }
}