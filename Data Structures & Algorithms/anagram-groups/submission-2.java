class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> myHash = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            myHash.putIfAbsent(sorted, new ArrayList<>());
            myHash.get(sorted).add(s);
        }
        return new ArrayList<>(myHash.values());
    }
}
