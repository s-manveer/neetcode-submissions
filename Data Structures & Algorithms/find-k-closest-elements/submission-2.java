class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int minDistance = Integer.MAX_VALUE;
        int idx = 0;
        int minDistIdx = -1;
        int n = arr.length;

        for(int val : arr) {
            if (Math.abs((double) x - val) < minDistance) {
                minDistance = (int) Math.abs((double) x - val);
                minDistIdx = idx; 
            }

            idx++;
        }
        
        list.add(arr[minDistIdx]);

        int l = minDistIdx - 1;
        int h = minDistIdx + 1;

        while (list.size() < k) {
            if (l >= 0 && h < n) {
                double lowDist = Math.abs((double)arr[l] - x);
                double highDist = Math.abs((double) arr[h] - x);

                if (lowDist <= highDist) {
                    list.add(arr[l]);
                    l--;
                } else {
                    list.add(arr[h]);
                    h++;
                }
            } else if (l >= 0) {
                list.add(arr[l]);
                l--;
            } else if (h < n) {
                list.add(arr[h]);
                h++;
            }
        }

        Collections.sort(list);

        return list;
    }
}