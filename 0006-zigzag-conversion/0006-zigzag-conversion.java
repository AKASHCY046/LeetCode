class Solution {
    public String convert(String s, int n) {
        if(n==1){
            return s;
        }
        StringBuilder st=new StringBuilder();
        int jum=(n-1)*2;
        for(int i=0;i<n;i++){
            for(int j=0;j+i<s.length();j+=jum){
                st.append(s.charAt(j+i));
                if(i!=0 && i!=n-1 && (jum+j-i)<s.length()){
                    st.append(s.charAt(jum+j-i));
                }
            }
        }
        return st.toString();
    }
}