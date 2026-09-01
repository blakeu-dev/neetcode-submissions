class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int currInt : nums) {
            count.put(currInt, count.getOrDefault(currInt, 0) + 1);
        }

        List<Integer> keys = new ArrayList<>(count.keySet());
        keys.sort((a,b) -> count.get(b) - count.get(a));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = keys.get(i);
        }

        return result;
        

        
        
    }
}
