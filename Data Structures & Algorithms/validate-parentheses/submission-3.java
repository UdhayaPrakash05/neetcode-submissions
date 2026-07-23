class Solution {
    public boolean isValid(String s) {
        Stack<Character> sss=new Stack<>();

        for(char ss:s.toCharArray()){
            if(ss=='['){
                sss.push(']');
            }else if(ss=='('){
                sss.push(')');
            }else if(ss=='{'){
                sss.push('}');
            }else if(sss.isEmpty()|| sss.pop()!=ss){
                return false;
            }
        }
        return sss.isEmpty();
    }
}
