class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> romanValues = new HashMap<>();

        romanValues.put("I", 1);
        romanValues.put("V", 5);
        romanValues.put("X", 10);
        romanValues.put("L", 50);
        romanValues.put("C", 100);
        romanValues.put("D", 500);
        romanValues.put("M", 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentValue = romanValues.get(String.valueOf(s.charAt(i)));

            if (i < s.length() - 1 && romanValues.get(String.valueOf(s.charAt(i + 1))) > currentValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }
        return result;
    }
}