class Solution {
    public void setZeroes(int[][] matrix) {
        boolean arr[][]=new boolean[matrix.length][matrix[0].length];
        System.out.print(matrix.length);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<matrix.length;k++){
                        arr[k][j]=true;
                    }
                    for(int k=0;k<matrix[0].length;k++){
                        arr[i][k]=true;
                    }
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(arr[i][j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}

/*

00 01 02 03
10 11 12 13
20 21 22 23
30 31 32 33

*/