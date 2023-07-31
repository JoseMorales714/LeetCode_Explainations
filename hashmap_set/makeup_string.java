class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length())
            return false;

        HashMap<Character, Integer> notes = new HashMap<>();

        // purpose of this for loop is to include the chars from magazine
        // if char !exist then add, else increment the frequency

        for (int ix = 0; ix < magazine.length(); ix++) {
            char c = magazine.charAt(ix);

            if (!notes.containsKey(c)) {
                notes.put(c, 1);
            } else {
                notes.put(c, notes.get(c) + 1);
            }

            System.out.println("Pass-> " + ix + ": " + notes);
        }

        // purpose of this for loop is to check if char is in map
        // AND to see if frequency is positive -> decrement frequency
        // else can return false since cant make up string
        // NEED to check if > 0 because otherwise see below for example
        // string 1: aa
        // string 2: ab
        // without the > 0 condition, then will return true but its actually false
        // in other words, the char exists but not enough to cover the string

        for (int ix = 0; ix < ransomNote.length(); ix++) {
            char c = ransomNote.charAt(ix);

            if (notes.containsKey(c) && notes.get(c) > 0) {
                notes.put(c, notes.get(c) - 1);
            } else {
                return false;
            }
            System.out.println("Passss-> " + ix + ": " + notes);
        }

        return true;

    }
}