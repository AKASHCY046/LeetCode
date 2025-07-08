class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>hs=new HashMap<>();
        for(String str:strs){
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            String x=new String(ch);
            if(!hs.containsKey(x)){
                hs.put(x,new ArrayList<String>());
            }
            hs.get(x).add(str);
        }
        return new ArrayList<>(hs.values());
    }
}