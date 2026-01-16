class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>li=new ArrayList<>();
        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int x:nums){
            hs.put(x,hs.getOrDefault(x,0)+1);
        }
        int max=nums.length/3;
        for(int x:hs.keySet()){
            if(hs.get(x)>max){
                li.add(x);
            }
            if(li.size()==2){
                break;
            }
        }
        return li;
    }
}