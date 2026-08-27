class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myHash = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (myHash.containsKey(complement)) {
                return new int[] {myHash.get(complement), i};
            }
            myHash.put(nums[i], i);
        }
        return null;
    }
}
