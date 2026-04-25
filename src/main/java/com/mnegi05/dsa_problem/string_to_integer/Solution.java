package com.mnegi05.dsa_problem.string_to_integer;

class Solution {

    public int myAtoi(String s) {

        int sign = 1;
        int result = 0;
        int i = 0;
        // s = s.trim();
        int n = s.length();

        // Skip spaces
        while (i < n && s.charAt(i) == ' ')
            i++;

        // Sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i++) == '-') ? -1 : 1;
        }

        while (i < n && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i++) - '0';

            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && digit > 7)) {

                return sign == 1
                        ? Integer.MAX_VALUE
                        : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
        }

        return sign * result;
    }
}
