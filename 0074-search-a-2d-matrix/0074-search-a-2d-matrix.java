class Solution {
    public boolean searchMatrix(int[][] matrix, int t) {
        int arr[]=new int[matrix.length*matrix[0].length];
        int x=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[x++]=matrix[i][j];
            }
        }
        Arrays.sort(arr);
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(t==arr[mid]){
                return true;
            }
            else if(t<arr[mid]){
                end--;
            }
            else{
                st++;
            }
        }
        return false;
    }
}