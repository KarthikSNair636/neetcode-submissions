class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<List<Integer>, List<String>> res = new HashMap<>();

        for(String s:strs){
            Integer[] count = new Integer[26];
            Arrays.fill(count,0);

            for(char c:s.toCharArray()){
                count[c - 'a']++;
            }

            List<Integer> key = Arrays.asList(count);

            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
