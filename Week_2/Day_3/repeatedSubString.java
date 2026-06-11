public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        String doApp = s + s;
        String str = doApp.substring(1, doApp.length() - 1);
        return str.contains(s);
    }
}
