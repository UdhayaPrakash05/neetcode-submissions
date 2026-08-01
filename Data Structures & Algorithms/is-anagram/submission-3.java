class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a=s.toCharArray();
        char[] a1=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(a1);
        if(Arrays.equals(a,a1)){
            return true;
        }
        return false;
    }
}
