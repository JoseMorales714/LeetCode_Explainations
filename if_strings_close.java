class Solution {
    public boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        // add condition for differnet letters

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // subtract 'a' to map the char c to its 0-25 index in alphabet
        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
        }

        for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
        }

        // for(int i : freq1) System.out.println(i);

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);

    }
}