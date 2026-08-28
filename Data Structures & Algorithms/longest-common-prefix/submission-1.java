class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = new String();
        Arrays.sort(strs);
        String first = strs[0];

        for(int i = 0; i < first.length(); i++) {
            char aChar = first.charAt(i);

            for(int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != aChar) return str;
            }

            str = str + aChar;
        }

        return str;
    }
}