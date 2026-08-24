class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int m = matrix[0].length;
        int high = matrix[0].length * matrix.length - 1;

        while (low <= high) {
            int mid = (low+high)/2;

            if (matrix[mid/m][mid%m] == target) {
                return true;
            } else if (matrix[mid/m][mid%m] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}
