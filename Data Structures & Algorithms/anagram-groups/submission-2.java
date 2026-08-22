class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            if (map.containsKey(sortedStr)) {
                List<String> values = map.get(sortedStr);
                values.add(strs[i]);
                map.put(sortedStr, values);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(strs[i]);
                map.put(sortedStr, newList);
            }
        }

        for(List<String> temp : map.values()) {
            list.add(temp);
        }
        
        return list;
    }
}
