class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> hm = new HashMap<>();

        for(String each: s1.split(" ")){
            hm.put(each,hm.getOrDefault(each,0)+1);
        }
        for(String each: s2.split(" ")){
            hm.put(each,hm.getOrDefault(each,0)+1);
        }
        List<String> lis = new ArrayList<String>();
        for(String each: hm.keySet()){
            if(hm.get(each) == 1){
                lis.add(each);
            }
        }
        return lis.stream().toArray(String[]::new);
    }
}