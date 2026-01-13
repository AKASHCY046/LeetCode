class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(hs.add(nums[i])){
                nums[a++]=nums[i];
            }
        }
        return a;
    }
}