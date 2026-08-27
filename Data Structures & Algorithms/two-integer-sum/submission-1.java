class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myHash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];

            if (myHash.containsKey(key)) {
                return new int[] {myHash.get(key), i};
            }
            myHash.put(nums[i], i);
        }
        return null;
    }
}
