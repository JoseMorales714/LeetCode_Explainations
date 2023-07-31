class Solution {
    public int lengthOfLongestSubstring(String s) {

        // size of string is stored here
        int size = s.length();
        int max_length = 0;
        int ecx = 0;

        Set<Character> charSet = new HashSet<>();

        for (int ix = 0; ix < size; ix++) {

            // if char set does not contain the current char in the string from 0 to n
            if (!charSet.contains(s.charAt(ix))) {

                // since not included then add current char
                charSet.add(s.charAt(ix));

                // max length is chosen because when cutting back to previous pointers
                // max length is chosen between current max length and when you add 1 more char
                max_length = Math.max(max_length, ix - ecx + 1);
            } else {

                // this would activate when found already exisiting char
                // so we would want to inc the first pointer
                while (charSet.contains(s.charAt(ix))) {
                    charSet.remove(s.charAt(ecx));
                    ecx++;

                }

                charSet.add(s.charAt(ix));

            }

        }

        return max_length;

    }
}