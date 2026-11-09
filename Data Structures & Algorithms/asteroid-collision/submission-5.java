class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack();

        for (int ast : asteroids) {
            while (!st.isEmpty() && ast < 0 && st.peek() > 0) {
                int diff = ast + st.peek();

                if (diff < 0) {
                    st.pop();
                } else if (diff > 0) {
                    ast = 0;
                } else {
                    ast = 0;
                    st.pop();
                }
            }

            if (ast != 0) {
                st.push(ast);
            }
        }

        int n = st.size();
        int[] res = new int[n]; 
        int i = 0;
        
        while (!st.isEmpty()) {
            res[n - 1 - i] = st.pop();
            i++;
        }

        return res;
    }
}