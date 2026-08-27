class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myHash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currInt = nums[i];
            int remaining = target - currInt;
            if (myHash.containsKey(remaining)) {
                return new int[] {myHash.get(remaining), i};
            }
            myHash.put(currInt, i);
        }
        return new int[] {};
    }
}
