class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>hs=new HashMap<>();
        //This creates a frequency map
        for(int x:nums){
            hs.put(x,hs.getOrDefault(x,0)+1);
        }
        List<Integer>[] ls=new List[nums.length+1];

        //for accessing the key
        for(int key:hs.keySet()){
            int a=hs.get(key);
            if(ls[a]==null){
                ls[a]=new ArrayList<>();
            }
            ls[a].add(key);
        }

        int res[]=new int[k];
        int c=0;
        for(int i=ls.length-1;i>=0 && c<k;i--){
            if(ls[i]!=null){
                for(Integer x:ls[i]){
                    res[c++]=x;
                }
            }
        }
        return res;
    }
}
/*
        The idea is to put all the elements in the map and map them to its frequency 
        Then add all the elements with same frequency in a Array of list then access it from the last to get the ans
        */