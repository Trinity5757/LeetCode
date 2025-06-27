class Solution {

    public int longestPalindrome(String s) {
        if (s.length() == 1) return 1;
        HashMap<Character, Integer> hash = new HashMap<>();
        int counter = 0;
        int tracker = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hash.put(c, hash.getOrDefault(c, 0) + 1);
        }

        if (hash.size() == 1) return hash.get(hash.keySet().iterator().next());

        for (Character key : hash.keySet()) {
            if (hash.get(key) % 2 == 0) {
                counter += hash.get(key);
            } else 
            {
                if (tracker == 0) 
                {
                    tracker = 1;
                    counter += hash.get(key);
                }
                else
                {
                 counter += hash.get(key) - 1;   
                }
            }
        }
        return counter;
    }
}
