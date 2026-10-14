class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                st.add(ch);
            } else if (ch == '}' || ch == ')' || ch == ']') {
                if (st.isEmpty()) return false;

                if ((ch == '}' && st.peek() == '{') ||
                (ch == ')' && st.peek() == '(') ||
                (ch == ']' && st.peek() == '[')
                ) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
