class Solution {
    public boolean squareIsWhite(String coordinates) {
        Set<Character> oddChars = Set.of('a','c','e','g'); 
        int num = Character.getNumericValue(coordinates.charAt(1));
        char chara = coordinates.charAt(0);
        if(oddChars.contains(chara) && num % 2 == 1) return false;
        else if(!oddChars.contains(chara) && num % 2 == 1) return true;
        else if(num % 2 == 0 && !oddChars.contains(chara)) return false;
        else return true;
        
    }
}