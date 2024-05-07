class Solution {
    public String longestCommonPrefix(String[] strts) {
        if (strts == null) {
            return "";
        }
        StringBuilder commonPrefix = new StringBuilder();

        String firstString = strts[0];
        for (int i = 0; i < firstString.length(); i++) {
            char currentChar = firstString.charAt(i);

            for (int j = 1; j < strts.length; j++) {
                String currentString = strts[j];
                if (i >= currentString.length() || currentString.charAt(i) != currentChar) {
                    return commonPrefix.toString();
                }
            }
            commonPrefix.append(currentChar);
        }
        return commonPrefix.toString();
    }
}