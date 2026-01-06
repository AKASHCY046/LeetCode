class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int co=0;
        long small=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int x:matrix[i]){
                sum+=Math.abs(x);
                if(x<0){
                    co++;
                }
                small=Math.min(Math.abs(x),small);
            }
        }
        if(co%2==0) return sum;
        
        return (long)sum-(2L*small);
    }
}