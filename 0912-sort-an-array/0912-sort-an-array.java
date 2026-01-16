class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        for(int x:nums){
            pq.add(x);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=pq.poll();
        }
        return nums;
    }
}