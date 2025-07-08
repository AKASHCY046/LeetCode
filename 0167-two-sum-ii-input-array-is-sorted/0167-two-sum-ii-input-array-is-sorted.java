class Solution {
    public int[] twoSum(int[] num, int tar) {
        int first=0;
        int last=num.length-1;
        while(true){
            if(tar<(num[first]+num[last])){
                last--;
                continue;
            }
            if(tar>(num[first]+num[last])){
                first++;
                continue;
            }
            else
            break;
        }
         return new int[] {first+1,last+1};
    }
}