class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int maj=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                maj=nums[i];
            }
            if(maj==nums[i]){
                c++;
            }
            else{
                c--;
            }
        }
        c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==maj){
                c++;
            }
        }
        return (c>(nums.length/2)?maj:-1);
    }
}