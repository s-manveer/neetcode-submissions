class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        boolean[] isUsed = new boolean[strs.length];
        List<List<String>> list = new ArrayList<>();

        for(int i = 0; i < strs.length; i++) {
            if (!isUsed[i]) {
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);

                for(int j = i+1; j < strs.length; j++) {
                    if (!isUsed[j] && isAnagram(strs[i], strs[j])) {
                        temp.add(strs[j]);
                        isUsed[j] = true;
                    }
                }

                list.add(temp);
            }
        }
        
        return list;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] table = new int[26];

        for(int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++) {
            if (table[i] != 0) return false;
        }

        return true;
    }
}
