class Solution {
    public boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        StringBuilder builder = new StringBuilder(value);
        return builder.reverse().toString().equals(value);
    }
}