class Solution {
    public String reverseWords(String s) {

        StringBuilder str = new StringBuilder();
        StringBuilder rtn_str = new StringBuilder();
        int ecx = -1;

        for (char x : s.toCharArray()) {
            str.append(x);
        }

        str = str.reverse();

        for (char x : str.toString().toCharArray()) {
            rtn_str.append(x);
        }

        return str.toString();

    }
}