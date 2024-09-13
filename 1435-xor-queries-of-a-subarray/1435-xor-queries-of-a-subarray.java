class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        
        int[] xorArr = new int[arr.length+1];
        xorArr[0] = 0;
        for (int i = 0; i< arr.length; i++){
            xorArr[i+1] = xorArr[i]^arr[i];
        }
        int[] ans = new int[queries.length];
        for(int i = 0; i< queries.length; i++){
            ans[i] = xorArr[queries[i][1]+1]^xorArr[queries[i][0]];
        }
        return ans;
    }
}