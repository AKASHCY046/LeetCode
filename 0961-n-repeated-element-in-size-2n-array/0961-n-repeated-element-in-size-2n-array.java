class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        Map<Integer,Integer>hs=new HashMap<>();
        for(int x:nums){
            if(hs.containsKey(x)){
                return x;
            }
            hs.put(x,hs.getOrDefault(x,0)+1);
        }
        return 0;
    }
}