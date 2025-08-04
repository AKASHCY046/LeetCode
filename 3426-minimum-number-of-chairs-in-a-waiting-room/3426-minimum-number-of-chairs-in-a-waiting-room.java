class Solution {
    public int minimumChairs(String s) {
        int c=0;
        int m=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                c++;
                m=Math.max(c,m);
            }else{
                c--;
            }
        }
        return m;
    }
}