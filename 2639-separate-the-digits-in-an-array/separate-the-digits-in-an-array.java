class Solution {

    public int[] separateDigits(int[] nums) {
        String test = Arrays.toString(nums);
        String str = test.replaceAll("[^0-9]", "");
        int[] answer = str.codePoints().map(Character::getNumericValue).toArray();

        return answer;
    }
}
