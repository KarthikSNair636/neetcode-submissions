class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 > len2) return false;
        
        int[] countMap = new int[26];
        
        for (int i = 0; i < len1; i++) {
            countMap[s1.charAt(i) - 'a']--;
            countMap[s2.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int count : countMap) {
            if (count == 0) matches++;
        }

        for (int i = len1; i < len2; i++) {
            if (matches == 26) return true;
            int rIdx = s2.charAt(i) - 'a';
            countMap[rIdx]++;
            if (countMap[rIdx] == 0) {
                matches++;
            } else if (countMap[rIdx] == 1) {
                matches--;
            }

            int lIdx = s2.charAt(i - len1) - 'a';
            countMap[lIdx]--;
            if (countMap[lIdx] == 0) {
                matches++;
            } else if (countMap[lIdx] == -1) {
                matches--;
            }
        }

        return matches == 26;
    }
}
