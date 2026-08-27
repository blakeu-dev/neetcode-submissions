class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> myHash = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            myHash.putIfAbsent(sorted, new ArrayList<>());
            myHash.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(myHash.values());
    }
}
