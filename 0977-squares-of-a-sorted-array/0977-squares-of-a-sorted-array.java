class Solution {
    public int[] sortedSquares(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)-> Math.abs(a)-Math.abs(b));
        for(int x:nums){
            pq.add(x);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=(int)Math.pow(pq.poll(),2);
        }
        return nums;
    }
}