class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        int ans = -1;

        for (int w : weights) {
            high += w;
            low = Math.max(low, w);
        }

        while(low <= high) {
            int mid = (low+high)/2;

            if (isValid(mid, weights, days)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid+1;
            }
        }

        return ans;
    }

    public boolean isValid(int c, int[] weights, int days) {
        int d = 1;
        int cw = 0;
        for(int w : weights) {
            if (cw + w > c) {
                d++;
                cw = w;
            } else {
                cw += w;
            }
        }

        if (d > days) {
            return false;
        } 

        return true;
    }
}