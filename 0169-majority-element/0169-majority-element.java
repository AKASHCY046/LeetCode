class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int x:nums){
            hs.put(x,hs.getOrDefault(x,0)+1);
        }
        int fre=0;
        int max=0;
        for(int x:hs.keySet()){
            if(fre<hs.get(x)){
                fre=hs.get(x);
                max=x;
            }
        }
        return max;
    }
}