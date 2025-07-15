class Solution {
    public void rotate(int[][] matrix) {
        Queue<Integer>qe=new LinkedList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=matrix.length-1;j>=0;j--){
                qe.add(matrix[j][i]);
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=qe.remove();
            }
        }
    }
}

/*

00 01 02
10 11 12
20 21 22

20 10 00
21 11 01
22 12 02
*/