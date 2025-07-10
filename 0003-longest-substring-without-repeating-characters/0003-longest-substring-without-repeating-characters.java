class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>hs=new HashMap<>();
        int st=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hs.containsKey(ch)){
                st=Math.max(st,hs.get(ch)+1);
            }
            hs.put(ch,i);
            max=Math.max(i-st+1,max);
        }
        return max;
    }
}