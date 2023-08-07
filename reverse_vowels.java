class Solution {
    public String reverseVowels(String s) {

        StringBuilder str = new StringBuilder();

        // this ensures any and all vowels are added to our experimental string
        for (char x : s.toCharArray()) {
            if ((x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A'
                    || x == 'E' || x == 'I' || x == 'O' || x == 'U')) {
                str.append(x);
            }
        }

        // reverse our string
        str = str.reverse();

        StringBuilder rtn_str = new StringBuilder();
        int counter = 0;

        // this for loops will check for any and all vowels again
        // if true then will append to our string with current char at the next index of
        // reversed string
        // else will append to our string at current index
        for (char x : s.toCharArray()) {
            if ((x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A'
                    || x == 'E' || x == 'I' || x == 'O' || x == 'U')) {
                rtn_str.append(str.charAt(counter++));
            } else {
                rtn_str.append(x);
            }
        }

        return rtn_str.toString();

    }
}