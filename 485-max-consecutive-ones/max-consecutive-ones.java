class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int length = nums.length;
        int count = 0;
        int number = 0;

        for (int num: nums)
        {
            if (num == 1)
            {
                number += 1;
                count = Math.max(count,number);
            }
            else
            {
                
                number = 0;
            }
        }
        return count;
    }
}
