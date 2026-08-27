class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> myHashSet = new HashSet<>();

        for (int currInt : nums) {
            if (myHashSet.contains(currInt)) {
                return true;
            }
            myHashSet.add(currInt);
        }
        return false;
    }
}