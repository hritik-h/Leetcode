class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        System.out.println(Arrays.toString(arr));
        String ans = Arrays.stream(arr).reduce("",(every,each) -> every+each).replaceFirst("^0+", "");
        System.out.println(ans);
        return ans.equals("") ?"0":ans ;
    }
}