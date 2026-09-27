class Solution {
    public int climbStairs(int n) {
        int prev = 1;
        int curr = 1;
        int next;
        for(int i = 1;i < n;i++){
            next = curr+prev;
            prev = curr;
            curr = next;
        }
        return curr;
    }
}
