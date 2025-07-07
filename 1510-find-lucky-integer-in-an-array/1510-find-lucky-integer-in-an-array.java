class Solution {
    public int findLucky(int[] arr) {
        int arr1[]=new int[501];
        for(int i=0;i<arr.length;i++){
            arr1[arr[i]]++;
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr1[arr[i]]==arr[i]){
                return arr[i];
            }
        }
        return -1;
    }
}