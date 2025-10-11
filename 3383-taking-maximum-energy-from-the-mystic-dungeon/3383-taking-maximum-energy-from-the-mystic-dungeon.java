class Solution {
    public int maximumEnergy(int[] arr, int k) {
        int m=-9999;
        for(int i=arr.length-1;i>=0;i--){
            if(i+k<arr.length){
                arr[i]=arr[i]+arr[i+k];
                m=Math.max(arr[i],m);
            }
            else{
                m=Math.max(arr[i],m);
            }
        }
        return m;
    }
}