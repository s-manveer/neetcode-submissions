class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;

        for(String op : operations) {
            if (op.equals("+")) {
                int val1 = st.pop();
                int val2 = val1 + st.peek();
                st.push(val1);
                st.push(val2);
                sum += val2;
            } else if (op.equals("C")) {
                int val = st.pop();
                sum -= val;
            } else if (op.equals("D")) {
                int val = st.peek();
                int doubleVal = 2 * val;
                sum += doubleVal;
                st.push(doubleVal);
            } else {
                int val = Integer.parseInt(op);
                st.push(val);
                sum += val;
            }
        }

        return sum;
    }
}