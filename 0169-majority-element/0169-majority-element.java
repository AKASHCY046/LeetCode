class Solution {
    public int majorityElement(int[] nums) {
        int k=0;
        int l=0;
        int h=0;
        for(int i=0;i<nums.length-1;i++){
            int x=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    x++;
                }
            }
            if(l<x){
                l=x;
                h=nums[i];
            }
        }
        if(nums.length >1){
        return h;
        }
        else{
            return nums[0];
        }
    }
}