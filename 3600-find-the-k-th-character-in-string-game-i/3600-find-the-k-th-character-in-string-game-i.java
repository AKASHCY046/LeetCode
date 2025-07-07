class Solution {
    public char kthCharacter(int k) {
        StringBuilder st=new StringBuilder("a");
        while(st.length()<=k){
            String x=st.toString();
            for(char ch:x.toCharArray()){
                if(ch=='z'){
                    ch='a';
                }
                else{
                    ch=(char)(ch+1);
                }
                st.append(ch);
            }
        }
        return st.charAt(k-1);
    }
}