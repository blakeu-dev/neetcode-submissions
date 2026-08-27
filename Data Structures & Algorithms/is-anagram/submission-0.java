class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> myHash = new HashMap<>();
        HashMap<Character, Integer> myHash2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            myHash.put(c, myHash.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            myHash2.put(c, myHash2.getOrDefault(c, 0) + 1);
        }
        return myHash.equals(myHash2);
    }
}


