class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i-1] == nums[i]) continue;

            for(int j = i+1; j < nums.length; j++) {
                if (j > i+1 && nums[j-1] == nums[j]) continue;

                int k = j+1;
                int l = nums.length - 1;

                while (k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);

                        list.add(temp);

                        k++;
                        l--;

                        while (k < l && nums[k-1] == nums[k]) k++;

                        while ( k < l && nums[l] == nums[l+1]) l--;

                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }

        return list;
    }
}