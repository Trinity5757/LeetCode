class Solution {
    public int firstUniqChar(String s) {
        int num = s.length();
        char temp = ' ';
        LinkedHashMap<Character, Integer> hash = new LinkedHashMap<>();

        for(int i = 0; i < num; i++)
        {
            hash.put(s.charAt(i), hash.getOrDefault(s.charAt(i), 0) + 1);
        }
         for (Map.Entry<Character, Integer> entry : hash.entrySet()) {
            if (entry.getValue().equals(1)) {
            temp = entry.getKey();
            break;
        }

         }
        for(int i = 0; i < num; i++)
        {
            if (temp == s.charAt(i)) return i;
        }

        return -1;
    }
}