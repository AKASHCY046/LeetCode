class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder st=new StringBuilder();
        int x=0;
        char cha[]=s.toCharArray();
        for(int i=cha.length-1;i>=0;i--){
            char ch=cha[i];
            if(ch=='-') continue;
            if(x==k){
                x=0;
                st.append('-');
            }
            ch=Character.toUpperCase(ch);
            
            st.append((ch));
            x++;
        }
        return st.reverse().toString();
    }
}