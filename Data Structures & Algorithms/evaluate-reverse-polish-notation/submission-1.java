class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack();

        for(String str : tokens) {
            if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
                int val1 = st.pop();
                int val2 = st.pop();

                if (str.equals("+")) {
                    int sum = val1 + val2;
                    st.push(sum);
                } else if ( str.equals("-")) {
                    int sub = val2 - val1;
                    st.push(sub);
                } else if ( str.equals("*")) {
                    st.push(val1 * val2);
                } else {
                    st.push(val2/val1);
                }
            } else {
                st.push(Integer.parseInt(str));
            }
        }

        return st.peek();

    }
}
