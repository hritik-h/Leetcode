class Solution {
    public boolean digitCount(String num) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i< num.length(); i++){
            hm.put(Character.getNumericValue(num.charAt(i)),hm.getOrDefault(Character.getNumericValue(num.charAt(i)),0)+1);
        } 
        for(int i = 0 ; i < num.length(); i++){
            if(hm.getOrDefault(i,0) != Character.getNumericValue(num.charAt(i))) return false;
        }
        return true;
    }
}