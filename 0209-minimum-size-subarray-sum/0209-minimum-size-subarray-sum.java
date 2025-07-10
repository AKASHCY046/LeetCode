class Solution {
    public int minSubArrayLen(int tar, int[] arr) {
        int min=arr.length+1;
        int last=0;
        int first=0;
        int sum=0;
        while(last<arr.length){
            sum+=arr[last];
            last++;

            while(sum>=tar){
                min=Math.min(last-first,min);
                sum-=arr[first];
                first++;
            }
        }
        return (min==arr.length+1)?0:min;
    }
}