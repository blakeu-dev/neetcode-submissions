class Solution {
    public boolean hasDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (j == i) {
                    continue;
                } else if (nums[j] == nums[i]) {
                    return true;
            }
            }
        }
        return false;
    }
}