class Solution {
    public int canBeTypedWords(String text, String str) {
        int ans=0;
        for(String x:text.split(" ")){
            boolean is=true;
            for(char ch:str.toCharArray()){
                if(x.contains(String.valueOf(ch))){
                    is=false;
                }
            }
            if(is) ans++;
        }
        return ans;
    }
}