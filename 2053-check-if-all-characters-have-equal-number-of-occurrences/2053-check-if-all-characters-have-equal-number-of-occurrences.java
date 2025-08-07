class Solution {
    public boolean areOccurrencesEqual(String s) {
        int num[]=new int[26];
        for(int i=0;i<s.length();i++){
            num[s.charAt(i)-'a']++;
        }
        int val=-1;
        for(int i=0;i<26;i++){
            if(num[i]!=0){
                if(val==-1){
                    val=num[i];
                }
                else{
                    if(num[i]!=val) return false;
                }
            }
        }
        return true;
    }
}