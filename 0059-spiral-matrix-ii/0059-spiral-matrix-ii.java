class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];
        int rst=0;
        int cst=0;
        int rend=n-1;
        int cend=n-1;
        int x=1;
        while(rst<=rend && cst<=cend){
            //row traversal
            for(int i=cst;i<=cend;i++){
                arr[rst][i]=x++;
            }
            rst++;

            //down the col
            for(int i=rst;i<=rend;i++){
                arr[i][cend]=x++;
            }
            cend--;

            //right to left in row
            if(rst<=rend){
            for(int i=cend;i>=cst;i--){
                arr[rend][i]=x++;
            }
            rend--;
            }

            //uptowards the col
            if(cst<=cend){
            for(int i=rend;i>=rst;i--){
                arr[i][cst]=x++;
            }
            cst++;
            }
        }
        return arr;
    }
}
//There are four parts in this qn

/*
00 01 02 03
10 11 12 13
20 21 22 23
30 31 32 33
*/
