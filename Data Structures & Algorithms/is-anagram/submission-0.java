class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char aChar : t.toCharArray()) {
            map.put(aChar, map.getOrDefault(aChar, 0) - 1);

            if (map.get(aChar) == 0) {
                map.remove(aChar);
            }
        }

        return map.isEmpty();
    }
}
