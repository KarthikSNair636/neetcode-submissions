class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int size = s.length();
        int rt = 0;
        Map<Character, Integer> dict = new HashMap<>();

        while (j < size) {
            char ch = s.charAt(j);
            if (dict.containsKey(ch) && dict.get(ch) >= i) {
                i = dict.get(ch) + 1;
            }
            dict.put(ch, j);
            if (j - i + 1 > rt) {
                rt = j - i + 1;
            }
            j++; 
        }

        return rt;
    }
}
