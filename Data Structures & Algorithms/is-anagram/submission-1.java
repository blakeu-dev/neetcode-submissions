class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            countS.put(sChar, countS.getOrDefault(sChar, 0) + 1);

            char tChar = t.charAt(i);
            countT.put(tChar, countT.getOrDefault(tChar, 0) + 1);
        }
        return countS.equals(countT);

    }
}














