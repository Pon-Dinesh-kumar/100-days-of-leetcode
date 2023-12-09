class Solution {
    public boolean halvesAreAlike(String s) {
        int len = s.length();
        int half = (len / 2);
        StringBuilder str1 = new StringBuilder(s.substring(0, half).toLowerCase());
        StringBuilder str2 = new StringBuilder(s.substring(half, len).toLowerCase());
        int c1 = count(str1);
        int c2 = count(str2);
        
        return c1 == c2;
    }

    public int count(StringBuilder str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                c++;
            }
        }
        return c;
    }
}
