class Solution {
    public int maxArea(int[] arr) {
        //This follows 2 pointer approch where one is from start and one is frm end
        int first=0;
        int last= arr.length-1;
        int max=0;
        while(first<last){
            int d=last-first;
            int min=(arr[first]<arr[last])?arr[first]:arr[last];
            max=Math.max(d*min,max);
            if(arr[first]<arr[last]){
                first++;
            }
            else{
                last--;
            }
        }
        return max;
    }
}
// arr=[1,8,6,2,5,4,8,3,7] 
//      0 1 2 3 4 5 6 7 8 

// arr=[1,1]
        