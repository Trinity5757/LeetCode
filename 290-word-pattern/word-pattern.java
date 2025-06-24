class Solution {

    public boolean wordPattern(String pattern, String s) {
        char[] pat = pattern.toCharArray();
        String[] split = s.split(" ");
        HashMap<Character, String> hash = new HashMap<>();
        HashSet<String> seen = new HashSet<>();

        if(pat.length != split.length) return false;

        for (int i = 0; i < pat.length; i++) {
            if (hash.containsKey(pat[i]) && !hash.get(pat[i]).equals(split[i])) return false;
            hash.put(pat[i], split[i]);
        }

        for (String value : hash.values()) {
            if(seen.contains(value)) return false;
            seen.add(value);
        }

        return true;
    }
}
