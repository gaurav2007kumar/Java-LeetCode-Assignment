class Solution {
    public String toLowerCase(String s) {
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            char b = s.charAt(i);
            if (b >= 'A' && b <= 'Z') {
                b = (char) (b + 32);
            }
            a = a + b;
        }
        return a;
    }
}
