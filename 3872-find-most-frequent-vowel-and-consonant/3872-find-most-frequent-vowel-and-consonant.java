class Solution {
    public int maxFreqSum(String s) {
        int arr[]=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        int v=0;
        int c=0;
        for(int i=0;i<26;i++){
            if(i==0 || i==4|| i==8 || i==14 || i==20){
                v=Math.max(v,arr[i]);
            }
            else{
                c=Math.max(c,arr[i]);
            }
        }
        return v+c;
    }
}