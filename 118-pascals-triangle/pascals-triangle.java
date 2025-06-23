class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> num = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == i || j == 0) {
                    num.add(1);
                } else {
                    int temp = answer.get(i - 1).get(j - 1) + answer.get(i - 1).get(j);
                    num.add(temp);
                }
            }
            answer.add(num);
        }
        return answer;
    }
}
