class Solution {
    public int countHillValley(int[] nums) {
        List<Integer>ls=new ArrayList<>();
        ls.add(nums[0]);
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(ls.get(ls.size()-1) == nums[i]){
                continue;
            }
            ls.add(nums[i]);
        }
        for(int i=1;i<ls.size()-1;i++){
            int prev=ls.get(i-1);
            int curr=ls.get(i);
            int ne=ls.get(i+1);
            if((curr<prev && curr<ne) ||(curr>prev && curr>ne)){
                c++;
            }
        }
        return c;
    }
}