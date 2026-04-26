package com.mnegi05.dsa_problem.Medium_problem.zigzag_conversion;

class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1)
            return s;

        StringBuilder result = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int row = 0; row < numRows; row++) {
            for (int j = row; j < n; j += cycleLen) {
                result.append(s.charAt(j));

                int second = j + cycleLen - 2 * row;
                if (row != 0 && row != numRows - 1 && second < n) {
                    result.append(s.charAt(second));
                }
            }
        }
        return result.toString();
    }
}
