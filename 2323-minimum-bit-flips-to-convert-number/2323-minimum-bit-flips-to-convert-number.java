class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = 0;
        while(start != 0 && goal != 0){
            int a = (start & 1), b = (goal & 1);
            ans += (start & 1) == (goal & 1) ? 0 : 1;;
            start = start >>  1;
            goal = goal >> 1;
        }
        int remaining = start + goal;
        while(remaining != 0){
            ans += (remaining & 1) == 1? 1:0;
            remaining = remaining >> 1;
        }
        return ans;
    }
}