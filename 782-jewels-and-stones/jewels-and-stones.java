class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        HashSet<Character> jewel = new HashSet<>();
        int count = 0;
        for(int i = 0; i < jewels.length(); i++)
        {
            jewel.add(jewels.charAt(i));
        }
        for(int i = 0; i < stones.length(); i++)
        {
            if(jewel.contains(stones.charAt(i))) count++;
        }
        return count;
    }
}