class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int arr[]:grid){
            int left=0;
            int right=arr.length-1;
            while(left<=right){
                int mid=(left+(right-left)/2);
                if(arr[mid]<0){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            c+=(arr.length-left);
        }
        return c;
    }
}