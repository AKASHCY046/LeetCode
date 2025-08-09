class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char ch1[]=ransomNote.toCharArray();
        char ch2[]=magazine.toCharArray();
        int m=ch1.length;
        int n=ch2.length;
        int arr[]=new int[26];
        for(char ch:ch2){
            arr[ch -'a']++;
        }
        for(char ch:ch1){
            if(arr[ch - 'a']==0){
                return false;
                
            }
            arr[ch-'a']--;
        }
        return true;
    }
}