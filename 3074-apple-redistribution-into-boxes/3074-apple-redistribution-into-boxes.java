class Solution {
    public int minimumBoxes(int[] apple, int[] arr) {
        int sum=0;
        for(int x:apple){
            sum+=x;
        }
        Arrays.sort(arr);
        int a=0;
        for(int i=arr.length-1;i>=0;i--){
            a++;
            sum-=arr[i];
            if(sum<=0){
                return a;
            }
        }
        return a;
    }
}
//15->(7+4+2+2)