class Solution {
    public int canBeTypedWords(String text, String str) {
        HashSet<Character>hs=new HashSet();
        for(char ch:str.toCharArray()){
            hs.add(ch);
        }
        int ans=0;
        for(String x:text.split(" ")){
            boolean is=true;
            for(char ch:x.toCharArray()){
                if(hs.contains(ch)){
                    is=false;
                }
            }
            if(is) ans++;
        }
        return ans;
    }
}