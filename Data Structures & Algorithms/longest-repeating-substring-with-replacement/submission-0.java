class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int start = 0;
        int end = 0;
        int n = s.length();
        int maxFreq = 0;
        int maxLen = 0;

        while (end < n) {
            char ch = s.charAt(end);
            freq[ch - 'A']++;
            maxFreq = Math.max(maxFreq, freq[ch-'A']);

            while (end - start + 1 - maxFreq > k) {
                char startChar = s.charAt(start);
                freq[startChar - 'A']--;
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
            end++;
        }

        return maxLen;
    }
}
