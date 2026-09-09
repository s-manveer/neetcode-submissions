class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[1] - b[1]
        );

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        map.forEach((key, value) -> {
            pq.offer(new int[]{key, value});

            if (pq.size() > k) {
                pq.poll();
            }
        });

        for(int i = 0; i < k; i++) {
            res[i] = pq.poll()[0];
        }

        return res;
    }
}
