class Solution {
    public String addBinary(String a, String b) {
        StringBuilder st=new StringBuilder();
        int x=a.length()-1;
        int y=b.length()-1;
        int c=0;
        while(x>=0 || y>=0 || c!=0){
            int sum=c;
            if(x>=0) sum+=a.charAt(x--)-'0';
            if(y>=0) sum+=b.charAt(y--)-'0';
            st.append(sum%2);
            c=sum/2;
        }
        return st.reverse().toString();
    }
}