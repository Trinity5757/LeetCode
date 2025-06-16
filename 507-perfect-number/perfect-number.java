class Solution {
    public boolean checkPerfectNumber(int num) {
        
        int count = num - 1;
        int amount = 0;

        while (count != 0)
        {
            if(num % count == 0)
            {
                amount += count;
            }
            count--;
        }

        return amount == num;
    }
}