class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int x:nums){
            hs.put(x,hs.getOrDefault(x,0)+1);
        }
        List<Integer> ts = new ArrayList<>(hs.values());
        Collections.sort(ts,Collections.reverseOrder());
        int c=ts.get(0);
        int i=1;
        while(i<ts.size() && ts.get(i)==ts.get(i-1)){
            c+=ts.get(i);
            i++;
        }
        return c;
    }
}