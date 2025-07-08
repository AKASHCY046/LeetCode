class Solution {
    public int[] productExceptSelf(int[] nums) {
        //if we multiply each number forward and backward we can able to get the ans
        int pro=1;
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=pro;
            pro*=nums[i];
        }
        pro=1;
        for(int i=nums.length-1;i>=0;i--){
            ans[i]*=pro;
            pro*=nums[i];
        }
        return ans;
    }
}

/*
nums = [1,2,3,4]

----->forward
ans=[1,1,2,6]

backward<----
ans=[24,12,8,6]
*/