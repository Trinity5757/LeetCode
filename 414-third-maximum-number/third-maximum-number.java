class Solution {

    public int thirdMax(int[] nums) {
        
        HashSet<Integer> numsSorted = new HashSet<>();

        for (int i : nums) {
            numsSorted.add(i);
        }
        TreeSet<Integer> sortedSet = new TreeSet<>(numsSorted);
        int[] Sorted = sortedSet.stream().mapToInt(Integer::intValue).toArray();

        if (Sorted.length < 3) {
            return Sorted[Sorted.length - 1];
        }

        return Sorted[Sorted.length - 3];
    }
}
