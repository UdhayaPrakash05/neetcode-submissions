class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String sr="";
        String fir=strs[0];
        String las=strs[strs.length-1];
        for(int i=0;i<Math.min(fir.length(),las.length());i++){
            if(fir.charAt(i)==las.charAt(i)){
                sr+=fir.charAt(i);
            }else{
                break;
            }
        }
        return sr;
    }
}