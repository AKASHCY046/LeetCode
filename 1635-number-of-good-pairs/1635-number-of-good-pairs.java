class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,ArrayList<Integer>>hs=new HashMap<>();
        int c=0;
        int i=0;
        for (int x : nums) {
            hs.putIfAbsent(x, new ArrayList<>());
            hs.get(x).add(i);
            i++;
        }
        for (ArrayList<Integer> li : hs.values()){
            if(li.size()>1){
                c += (li.size() * (li.size() - 1)) / 2;

            }
        }
        return c;
    }
}