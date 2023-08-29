class Solution {
    public String removeStars(String s) {

        StringBuilder r_str = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int ix = 0; ix < s.length(); ix++) {
            char c = s.charAt(ix);
            if (c == '*') {
                st.pop();
            } else {
                st.push(c);
            }
        }

        while (!st.empty()) {
            r_str.append(st.peek());
            st.pop();
        }

        r_str.reverse();

        return r_str.toString();

    }
}