class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> hs = new HashSet<Character>();

        for(int i =0; i<allowed.length(); i++){
            hs.add(allowed.charAt(i));
        }
        int ans = 0;
        for(String each: words){
            for(int i =0; i<each.length(); i++){
                if(!hs.contains(each.charAt(i))){
                    break;
                }
                if(i == each.length()-1) ans += 1;
            }
        }
        return ans;
    }
}