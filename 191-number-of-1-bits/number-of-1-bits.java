class Solution {
    public int hammingWeight(int n) {
        
        int num = 0;
        int quotient = 1;
        int remainder;
        int count = 0;

        while(quotient != 0)
        {
            quotient = n / 2;
            remainder = n % 2;
            n = quotient;
            if(remainder == 1)
            {
                count++;
            }
        }
        return count;

    }
}