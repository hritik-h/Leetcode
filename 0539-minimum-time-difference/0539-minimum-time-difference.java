class Solution {
    public int diff(String str1,String str2){
        int minA = Integer.parseInt(str1.substring(0,2)) * 60 + Integer.parseInt(str1.substring(3));
        int minB = Integer.parseInt(str2.substring(0,2)) * 60 + Integer.parseInt(str2.substring(3));
        return Math.min(minA-minB+1440,minB-minA);

    }
    public int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);
        int min = diff(timePoints.get(0),timePoints.get(timePoints.size()-1));
        for(int i = 1; i<timePoints.size(); i++){
            min = Math.min(min,diff(timePoints.get(i-1),timePoints.get(i)));
        }
        return min;
    }
}