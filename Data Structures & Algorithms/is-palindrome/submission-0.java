class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char left = s.charAt(start);
            char right = s.charAt(end);
            if (!Character.isLetterOrDigit(left)) {
                start++;
            }
            else if (!Character.isLetterOrDigit(right)) {
                end--;
            }
            else {
                if  (left != right) {
                     return false;
                }
                start++;
                end--;
               
            }

        }
    return true;
    }
}
