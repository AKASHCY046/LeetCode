class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer>hs=new HashMap<>();
        for(char ch:text.toCharArray()){
            if("baloon".indexOf(ch)!=-1){
                hs.put(ch,hs.getOrDefault(ch,0)+1);
            }
        }
        int min = Integer.MAX_VALUE;
        min=Math.min(hs.getOrDefault('a',0),min);
        min=Math.min(hs.getOrDefault('b',0),min);
        min=Math.min(hs.getOrDefault('n',0),min);
        min=Math.min(hs.getOrDefault('l',0)/2,min);
        min=Math.min(hs.getOrDefault('o',0)/2,min);
        return min;
    }
}