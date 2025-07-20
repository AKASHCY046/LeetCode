class Solution {
    public int[] runningSum(int[] nums) {
        int sum=nums[0];
        int x=0;
        for(int i=1;i<nums.length;i++){
            x=nums[i];
            nums[i]=sum+x;
            sum+=x;
        }
        return nums;
    }
}