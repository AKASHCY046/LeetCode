class Solution {
    public int maxOperations(int[] nums) {
        int c=0;
        int sum=nums[0]+nums[1];
        for(int i=0;i<nums.length;i+=2){
            if(i+1<nums.length){
            if(nums[i]+nums[i+1]==sum){
                c++;
            }
            else{
                break;
            }
            }
        }
        return c;
    }
}