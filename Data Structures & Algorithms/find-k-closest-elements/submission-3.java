class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        int l = 0;
        int h = n - 1;

        while (h - l + 1 > k) {
            double distL = Math.abs((double) x - arr[l]);
            double distH = Math.abs((double) x - arr[h]);

            if (distL <= distH) {
                h--;
            } else {
                l++;
            }
        }

        for(int i = l; i <= h; i++) {
            list.add(arr[i]);
        }

        return list;
    }
}