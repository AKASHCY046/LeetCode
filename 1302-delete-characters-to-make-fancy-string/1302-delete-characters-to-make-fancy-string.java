class Solution {
    public String makeFancyString(String s) {
        StringBuilder st=new StringBuilder();
        int c=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }
            else{
                if(c>=3 || c==2){
                    st.append(s.charAt(i-1));
                    st.append(s.charAt(i-1));
                }
                else{
                    st.append(s.charAt(i-1));
                }
                c=1;
            }
        }

        if(c>=3 || c==2){
            st.append(s.charAt(s.length()-1));
            st.append(s.charAt(s.length()-1));
        }
        else{
            st.append(s.charAt(s.length()-1));
        }
        return st.toString();
    }
}