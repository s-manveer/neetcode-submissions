class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int start = 0;
        int end = 0;
        int[] arr = new int[26];
        int n = s2.length();
        int m = s1.length();
        int count = 0;

        for(int i = 0; i < m; i++) {
            arr[s1.charAt(i) - 'a']++;
        }

        while (end < n) {
            arr[s2.charAt(end) - 'a']--;

            if (arr[s2.charAt(end) - 'a'] >= 0) {
                count++;
            }

            while (end - start + 1 > m) {
                arr[s2.charAt(start) - 'a']++;

                if (arr[s2.charAt(start) - 'a'] > 0) {
                    count--;
                }

                start++;
            }

            if (count == m) {
                return true;
            }

            end++;
        }

        return false;
    }
}
