class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int[] arr1 = new int[m];

        for(int k = 0; k < m; k++) {
            arr1[k] = nums1[k];
        }

        int l = 0;

        while (i < m && j < n) {
            if (arr1[i] < nums2[j]) {
                nums1[l] = arr1[i];
                l++;
                i++;
            } else {
                nums1[l] = nums2[j];
                j++;
                l++;
            }
        }

        while (i < m) {
            nums1[l] = arr1[i];
            l++;
            i++;
        }

        while (j < n) {
            nums1[l] = nums2[j];
            j++;
            l++;
        }
    }
}