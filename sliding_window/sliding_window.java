package sliding_window;

import java.util.Set;

class Solution {
    public int maxVowels(String s, int k) {

        Set<Character> vowel_list = Set.of('a', 'e', 'i', 'o', 'u');

        int ecx = 0;

        for (int ix = 0; ix < k; ix++) {
            ecx += vowel_list.contains(s.charAt(ix)) ? 1 : 0;
            // if(vowel_list.contains(s.charAt(ix))){
            // ecx++;
            // }
        }

        // 1 = 1
        int rtn_length = ecx;

        for (int ix = k; ix < s.length(); ix++) {
            // 2...2...3...2...2...1
            ecx += vowel_list.contains(s.charAt(ix)) ? 1 : 0;
            // 1...2...3...1...1...2
            ecx -= vowel_list.contains(s.charAt(ix - k)) ? 1 : 0;
            // (1,1)...(1,2)...(3,3)...(2,1)...(2,1)...(2,2)...
            rtn_length = Math.max(rtn_length, ecx);
        }

        return rtn_length;
    }
}