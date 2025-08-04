class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int r=0;
        int min=Integer.MAX_VALUE;
        int left=0;
        int right=0;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            left=i+1;
            right=nums.length-1;
            while(left<right){
                int sum=nums[left]+nums[right]+nums[i];
                if(sum==target){
                    return sum;
                }
                int mindif=Math.abs(target-sum);
                if(min>mindif){
                    r=sum;
                    min=mindif;
                }
                if(sum<target){
                    left++;
                }
                if(sum>target){
                    right--;
                }
            }
        }
        return r;
    }
}