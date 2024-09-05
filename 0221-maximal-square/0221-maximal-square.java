class Solution {
    public int maximalSquare(char[][] matrix) {
        int[][] matrixx = new int[matrix.length][matrix[0].length];
        int max = 0;
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrixx[i][j] = matrix[i][j] == '1' ? 1 : 0;
                if(matrix[i][j] == '1') max = 1;
            }
        }
        int ii = 0;
        int jj = 0;
        
        for(int i = 1; i< matrix.length; i++){
            ii = i;
            for(int j = 1; j< matrix[0].length; j++){
                jj = j;
                if(matrixx[i][j] == 1) matrixx[i][j] = Math.min(Math.min(matrixx[i-1][j],matrixx[i][j-1]), matrixx[i-1][j-1]) + 1;
                System.out.println(Math.min(Math.min(matrixx[i-1][j],matrixx[i][j-1]), matrixx[i-1][j-1]));
                max = Math.max(max,matrixx[i][j]);
            }

        }
        return max*max;
    }
}