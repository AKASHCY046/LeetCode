class Solution {
    public String decodeString(String s) {
        Stack<Integer>st=new Stack<>();
        Stack<String>st1=new Stack<>();
        String current="";
        int num=0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch=='['){
                st.push(num);
                st1.push(current);
                num=0;
                current="";
            }
            else if(ch==']'){
                String temp=st1.pop();
                int x=st.pop();
                current=temp+current.repeat(x);
            }
            else{
                current+=ch;
            }
        }
        return current;
    }
}