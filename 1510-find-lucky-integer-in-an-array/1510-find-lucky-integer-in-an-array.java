class Solution {
    public int findLucky(int[] arr) {
        int arr1[]=new int[501];
        for(int i=0;i<arr.length;i++){
            arr1[arr[i]]++;
        }
        for(int i=500;i>=1;i--){
            if(arr1[i]==i){
                return i;
            }
        }
        return -1;
    }
}