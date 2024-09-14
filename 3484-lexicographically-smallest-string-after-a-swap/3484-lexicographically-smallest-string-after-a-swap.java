class Solution {
    public String getSmallestString(String s) {
        char[] charArr = s.toCharArray();
        int[] arr  = new int[charArr.length];
        int index = 0;
        for(char c: charArr){
            arr[index] =  c- 48;
            index += 1;
        }
        String ans  = "";
        for(int i = 1; i <arr.length; i++){
           
            if(arr[i]%2 == arr[i-1]%2 && (arr[i]<arr[i-1])){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                break;
            }
        }
        
        System.out.println(Arrays.toString(arr));
        return Arrays.stream(arr)
    .mapToObj(each -> String.valueOf(each))
    .reduce("", (str, each) -> str + each);

    }
}