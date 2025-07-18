class Solution {
    public void setZeroes(int[][] matrix) {
        boolean arr[][]=new boolean[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                   //put true in both the row and col
                   //for row
                   for(int x=0;x<matrix[0].length;x++){
                    arr[i][x]=true;
                   }
                   //for col
                   for(int x=0;x<matrix.length;x++){
                    arr[x][j]=true;
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