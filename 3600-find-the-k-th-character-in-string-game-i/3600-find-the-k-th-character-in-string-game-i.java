class Solution {
    public char kthCharacter(int k) {
        if(k==1){
            return 'a';
        }
        StringBuilder st=new StringBuilder("a");
        while(st.length()!=k){
            String x=st.toString();
            for(char ch:x.toCharArray()){
                if(ch=='z'){
                    ch='a';
                }
                else{
                    ch=(char)(ch+1);
                }
                st.append(ch);
                if(st.length()==k){
                    break;
                }
            }
        }
        return st.charAt(k-1);
    }
}