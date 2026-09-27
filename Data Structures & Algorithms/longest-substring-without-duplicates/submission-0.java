class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> chars = new HashSet<>();
        int left = 0;
        int result = 0;

        for (int r = 0; r < s.length(); r++) {
            while (chars.contains(s.charAt(r))) {
                chars.remove(s.charAt(left));
                left++;
            }
            chars.add(s.charAt(r));
            result = Math.max(result, r-left+1);
        }
        return result;
    }
}
