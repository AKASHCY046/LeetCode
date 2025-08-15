class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder st=new StringBuilder();
        int a=0;
        int i=0;
        for(i=0;i<s.length();i+=k){
            int end=Math.min(i+k,s.length());
            if(a%2==0){
                st.append(new StringBuilder(s.substring(i,end)).reverse().toString());
            }
            else{
                st.append(s.substring(i,end));
            }
            a++;
        }
        return st.toString();
    }
}

//ab cd ef g
//01 23 45 6
