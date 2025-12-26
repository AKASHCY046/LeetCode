class Solution {
    public int timeRequiredToBuy(int[] arr, int k) {
        int i=0;
        int c=0;
        while(arr[k]!=0){
            if(arr[i]==0){
                i=(i+1)%(arr.length);
                continue;
            }
            c++;
            arr[i]--;
            i=(i+1)%(arr.length);
        }
        return c;
    }
}