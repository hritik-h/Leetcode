class Solution {
    public int longestSubarray(int[] nums) {
        if(nums.length <= 1) return nums.length;

        int[] longesIncreasingSubsequenceAt = new int[nums.length];
        int start = 0;
        int maxx =  nums[0];
        longesIncreasingSubsequenceAt[0] = nums[0];
        for(int i = 1; i< nums.length; i++){
            if((longesIncreasingSubsequenceAt[i-1] & nums[i]) > nums[i]){
                 longesIncreasingSubsequenceAt[i] = longesIncreasingSubsequenceAt[i-1] & nums[i];
            }else{
               longesIncreasingSubsequenceAt[i]  = nums[i];
               start = i;
            }
            maxx = Math.max(maxx,longesIncreasingSubsequenceAt[i]);
        }
                int maxLength = 0; // Longest subarray length for maxx
        int currentLength = 0; // Current subarray length

        // Iterate through the array
        for (int i = 0; i < longesIncreasingSubsequenceAt.length; i++) {
            if (longesIncreasingSubsequenceAt[i] == maxx) {
                currentLength++; // Increase length if current element equals maxx
            } else {
                maxLength = Math.max(maxLength, currentLength); // Update max length
                currentLength = 0; // Reset for the next potential subarray
            }
        }

        // Final check to consider the last subarray
        maxLength = Math.max(maxLength, currentLength);

        return maxLength;
    }
}