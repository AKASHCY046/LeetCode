class Solution {
    public int jump(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int max=0;
        int c=0;
        int last=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]+i);
            if(i==last){
                last=max;
                c++;
                if(last>=nums.length-1){
                    return c;
                }
            }
        }
        return c;
    }
}