class Solution {
    public int fib(int n) {
        
        int num = 0;
        int num2 = 1;
        int temp = num;

        for (int i = 0; i < n; i++)
        {
            temp = num2 + num;
            num = num2;
            num2 = temp;
        }
        return num;
    }
}