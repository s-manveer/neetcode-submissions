class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuffer sb = new StringBuffer();

        int i = 0;
        int j = 0;
        int n1 = word1.length();
        int n2 = word2.length();


        while (i < n1 && j < n2) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }

        while (i < n1) {
            sb.append(word1.charAt(i));
            i++;
        }

        while(j < n2) {
            sb.append(word2.charAt(j));
            j++; 
        }

        return sb.toString();
    }
}