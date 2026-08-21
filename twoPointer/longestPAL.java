class Solution {

    public String longestPalindrome(String s) {

        if (s == null || s.length() < 2) {
            return s;
        }
        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            int left = i;
            int right = i;

            while (left >= 0 && right < s.length() &&
                    s.charAt(left) == s.charAt(right)) {

                if (right - left + 1 > maxLength) {
                    start = left;
                    maxLength = right - left + 1;
                }

                left--;
                right++;
            }

            // Even length palindrome
            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length() &&
                    s.charAt(left) == s.charAt(right)) {

                if (right - left + 1 > maxLength) {
                    start = left;
                    maxLength = right - left + 1;
                }

                left--;
                right++;
            }
        }

        return s.substring(start, start + maxLength);
    }
}


//
class Solution {

    public String longestPalindrome(String s) {

        if (s == null || s.length() == 0) {
            return "";
        }

        // Transform string
        StringBuilder sb = new StringBuilder("^");

        for (char ch : s.toCharArray()) {
            sb.append("#").append(ch);
        }

        sb.append("#$");

        char[] str = sb.toString().toCharArray();

        int[] p = new int[str.length];

        int center = 0;
        int right = 0;

        int maxLen = 0;
        int centerIndex = 0;

        for (int i = 1; i < str.length - 1; i++) {

            int mirror = 2 * center - i;

            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }

            while (str[i + (1 + p[i])] == str[i - (1 + p[i])]) {
                p[i]++;
            }

            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }

        int start = (centerIndex - maxLen) / 2;

        return s.substring(start, start + maxLen);
    }
}