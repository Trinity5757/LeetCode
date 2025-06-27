class Solution {
    public int reverse(int x) {
        String s = Integer.toString(x);
        try{
        StringBuilder i = new StringBuilder(s).reverse();
        if(s.charAt(0) == '-')
        {
            i.deleteCharAt(i.length() - 1);
            return -Integer.parseInt(i.toString());
        }
        return Integer.parseInt(i.toString());
        }
        catch (NumberFormatException e)
        {
            return 0;
        }
    }
}