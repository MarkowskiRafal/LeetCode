class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> romanNumbers = new HashMap<>();

        romanNumbers.put("I", 1);
        romanNumbers.put("V", 5);
        romanNumbers.put("X", 10);
        romanNumbers.put("L", 50);
        romanNumbers.put("C", 100);
        romanNumbers.put("D", 500);
        romanNumbers.put("M", 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanNumbers.get(String.valueOf(s.charAt(i)));

            if (i < s.length() - 1 && romanNumbers.get(String.valueOf(s.charAt(i + 1))) > currentVal) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }
        return result; 
    }
}