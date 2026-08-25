class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        int ans = -1;

        for(int pile : piles) {
            high = Math.max(high, pile);
        }

        while (low <= high) {
            int mid = (low+high)/2;

            if (isValid(mid, piles, h)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public boolean isValid(int k, int[] piles, int h) {
        int t = 0;

        for (int p : piles) {
            t += Math.ceil((double)p/(double)k);

            if (t > h) return false;
        }

        return true;
    }
}
