class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> mySet = new HashSet<>();
        int longest = 0;
        for (int curint : nums) {
            mySet.add(curint);
        }


        for (int n : mySet) {
            if (!mySet.contains(n-1)) {
            int length = 1;
            while (mySet.contains(n+length)) {
                length++;
            }
            if (length > longest) {
                longest = length;
            }
        }
        

        }
        return longest;


    }
}
