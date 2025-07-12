class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=-10000;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        max=Math.max(max,sum/k);
        for(int i=k;i<nums.length;i++){
            sum-=nums[i-k];
            sum+=nums[i];
            System.out.println(sum);
            max=Math.max(sum/k,max);
        }
        return max;
        //nums = [1,12,-5,-6,50,3]
        //        0  1  2  3  4 5
    }
}