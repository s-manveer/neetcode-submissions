class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int a = 0;
        int b = 0;
        int countA = 0;
        int countB = 0;

        for(int i = 0; i < nums.length; i++) {
            if (countA == 0 && nums[i] != b) {
                a = nums[i];
                countA = 1;
            } else if (countB == 0 
            && nums[i] != a) {
                b = nums[i];
                countB = 1;
            } else if (nums[i] == a) {
                countA++;
            } else if (nums[i] == b) {
                countB++;
            } else {
                countA--;
                countB--;
            }
        }

        countA = 0;
        countB = 0;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == a) {
                countA++;
            } else if (nums[i] == b) {
                countB++;
            }
        }

        List<Integer> list = new ArrayList<>();

        if (countA >= nums.length/3 + 1) list.add(a);

        if (countB >= nums.length/3 + 1) list.add(b);

        return list;
    }
}