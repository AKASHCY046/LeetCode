class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>hs=new HashMap<>();
        int max=0;
        int c=0;
        for(int x:nums){
            hs.put(x,hs.getOrDefault(x,0)+1);
            max=Math.max(max,hs.get(x));
        }
        for(int x:hs.values()){
            if(x==max){
                c+=x;
            }
        }
        
        return c;
    }
}