class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int maxLen = 0;

        while (end < s.length()) {
            char ch = s.charAt(end);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.get(ch) > 1) {
                char startChar = s.charAt(start);
                map.put(startChar, map.get(startChar)-1);

                if(map.get(startChar) == 0) {
                    map.remove(startChar);
                }

                start++;
            }

            maxLen = Math.max(maxLen, end - start+1);
            end++;
        }

        return maxLen;
    }
}
