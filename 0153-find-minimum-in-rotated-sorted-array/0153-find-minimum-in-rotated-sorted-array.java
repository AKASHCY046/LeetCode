class Solution {
    public int findMin(int[] arr) {
        int st=0;
        int end=arr.length-1;
        if(arr[st]<arr[end]){
            return arr[st];
        }
        while(st<end){
            int mid=(st+(end-st)/2);
            if(mid-1>=0 && arr[mid]<arr[mid-1]){
                return arr[mid];
            }
            if(arr[mid]>arr[mid+1]){
                return arr[mid+1];
            }
            else if(arr[st]>arr[mid]){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return arr[st];
    }
}