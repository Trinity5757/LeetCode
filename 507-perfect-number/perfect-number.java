class Solution {
    public boolean checkPerfectNumber(int num) {
        
        ArrayList<Integer> divisors = new ArrayList<>();
        int count = num - 1;
        int amount = 0;

        while (count != 0)
        {
            if(num % count == 0)
            {
                divisors.add(count);
            }
            count--;
        }

        for(int i : divisors)
        {
            amount += i;
        }
        if(amount == num)
        {
            return true;
        }        
        return false;
    }
}