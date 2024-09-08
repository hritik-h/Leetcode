class Solution {
    public int minLength(String s) {
        StringBuffer sb = new StringBuffer(s);
        boolean wasThere = true;
        while(wasThere){
            wasThere = false;
            int i = 0;
            while(i<sb.length()-1){
            if(sb.substring(i, i+2).equals("AB") || sb.substring(i, i+2).equals("CD")) {
                sb.delete(i,i+2);
                wasThere = true;
                continue;   
            }
            
            i+=1;
        }
        }
        return sb.length();
        
    }
}