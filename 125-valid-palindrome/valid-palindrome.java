class Solution {
    public boolean isPalindrome(String s) {
        
        
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int j = s.length() - 1;
        System.out.println(s);
        for(int i = 0; i < j; i++)
        {
            if(s.charAt(i) != s.charAt(j - i)) return false;
        }
        
        return true;
    }
}