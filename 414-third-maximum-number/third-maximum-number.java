class Solution {

    public int thirdMax(int[] nums) {
        
        TreeSet<Integer> sortedSet = new TreeSet<>();
        for (int i : nums) {
            sortedSet.add(i);
        }
        

        if (sortedSet.size() < 3) {
            return sortedSet.last();
        }

        sortedSet.pollLast();
        sortedSet.pollLast();

        return sortedSet.last();
    }
}
