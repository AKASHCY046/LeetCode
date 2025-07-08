class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0){
            return 0;
        }
        int max=0;
        Arrays.sort(arr);
        int s=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                continue;
            }
            if(arr[i]+1==arr[i+1]){
                s++;
            }
            else{
                max=Math.max(max,s);
                s=1;
            }
        }
        
        return Math.max(max,s);
    }
}

// [0,3,7,2,5,8,4,6,0,1]
// [0,0,1,2,3,4,5,6,7,8]
//  1 1 2 3 4 5 6 7 8 9
