class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> h=new HashSet<>();
        for(int i:nums){
            if(!h.add(i)) return true;
        }
        return false;
    }
}