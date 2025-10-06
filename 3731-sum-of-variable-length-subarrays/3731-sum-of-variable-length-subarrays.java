class Solution {
    public int subarraySum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int x=Math.max(0,i-nums[i]);
            for(int j=x;j<=i;j++){
                sum+=nums[j];
            }
        }
        return sum;
    }
}