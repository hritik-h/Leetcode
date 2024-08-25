class Solution {
    int index = 0;
    public int findInteger(String s, int k){
        for(int i = k; i<s.length(); i++ ){
            if(s.charAt(i) == '+' || s.charAt(i)=='-' || s.charAt(i)=='/'){
                this.index = i;
                break;
            }
        }
        this.index = this.index> k?this.index:s.length();
        System.out.println(s.substring(k,this.index));
        return Integer.valueOf(s.substring(k,this.index));
    }
    public String fractionAddition(String expression) {
        List<Integer> numer = new ArrayList<Integer>();
        List<Integer> denom = new ArrayList<Integer>();
        for(int i = 0; i< expression.length(); i++){
            if(expression.charAt(i) == '-'){
                numer.add(findInteger(expression,i+1)*-1);
                denom.add(findInteger(expression,this.index+1));
                i = this.index-1;
            } else if(expression.charAt(i) == '+'){
                numer.add(findInteger(expression,i+1));
                denom.add(findInteger(expression,this.index+1));
                i = this.index-1;
            } else{
                numer.add(findInteger(expression,i));
                denom.add(findInteger(expression,this.index+1));
                i = this.index-1;
            }
        }
        System.out.println(numer);
        System.out.println(denom);
        int mul = denom.stream().reduce(1,(a,b)->a*b);
        int summ = 0;
        for(int i = 0; i<denom.size(); i++){
            summ += (mul/denom.get(i)*numer.get(i));
        }
        System.out.println(summ);
        System.out.println(mul);
        int[] divArr =  {7,5,3,2};
        for(int i = 0; i<divArr.length; i++){
            if(summ % divArr[i]== 0 && mul % divArr[i] == 0){
                summ /= divArr[i];
                mul /= divArr[i];
                i -= 1;
            }
        }
        
        return Integer.toString(summ) + "/" +Integer.toString(mul);
    }
}