class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0, j = 0;
        for (int k = 0; k < t.length(); k++) {
            if (i < s.length()) {
                if (s.charAt(i) == t.charAt(j)) {
                    i++;
                    j++;
                } else {
                    j++;
                }
            }
        }
        return i == s.length();

    }
}

// A subsequence of a string is a new string that is formed from the original
// string by deleting some (can be none) of the characters without disturbing
// the relative positions of the remaining characters. (i.e., "ace" is a
// subsequence of "abcde" while "aec" is not).