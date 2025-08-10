class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long sum=0;
        long co=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                co+=1;
            }
            else{
                co=0;
            }
            sum+=co;
        }
        return sum;
    }
}