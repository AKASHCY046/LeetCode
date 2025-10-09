class Solution {
    public int[][] imageSmoother(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int arr[][]=new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=find(i,j,matrix);
            }
        }
        return arr;
    }

    public static int find(int x,int y,int arr[][]){
        int sum=0;
        int n=arr.length;
        int m=arr[0].length;
        int count=1;
            sum+=arr[x][y];
            if (x-1 >=0 ){
                if (y-1>=0) {
                    sum += arr[x - 1][y - 1];
                    count++;
                }
                if (y+1<=m-1){
                    sum+=arr[x-1][y+1];
                    count++;
                }
                sum+=arr[x-1][y];
                count++;
            }

            if (x+1<=n-1){
                sum+=arr[x+1][y];
                count++;
                if (y-1>=0){
                    sum+=arr[x+1][y-1];
                    count++;
                }

                if(y+1<=m-1){
                    sum+=arr[x+1][y+1];
                    count++;
                }
            }

            if (y-1>=0){
                sum+=arr[x][y-1];
                count++;
            }

            if (y+1<=m-1){
                sum+=arr[x][y+1];
                count++;
            }
            double ans=sum/count;
        return (int)Math.floor((double)sum / count);
    }
}