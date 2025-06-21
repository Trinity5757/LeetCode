class Solution {
    public void reverseString(char[] s) {
        
        char c;
        int length = s.length - 1;

        for (int i = 0; i < s.length / 2; i++)
        {
            c = s[i];
            s[i] = s[length - i];
            s[length - i] = c;
        }
    }
}