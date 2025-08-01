class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int a=0;
        int b=mat.length-1;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            if(a==b){
                a++;
                b--;
                continue;
            }
            sum+=mat[b--][a++];
        }
        return sum;
        
        
    }
}