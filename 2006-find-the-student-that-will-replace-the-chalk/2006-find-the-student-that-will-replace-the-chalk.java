class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for (int c : chalk) {
            sum += c;
        }
        long kr = k % sum;
        for(int i = 0; i< chalk.length; i++){
            if(kr<chalk[i]){
                return i;
            }
            kr-=chalk[i];
        }
        return 0;
    }
}