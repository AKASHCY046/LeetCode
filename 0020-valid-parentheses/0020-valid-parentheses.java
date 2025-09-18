class Solution {
    public boolean isValid(String s) {
        if(s.length()%2==1){
            return false;
        }
        char ch[]=s.toCharArray();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(ch[i]=='('||ch[i]=='['||ch[i]=='{'){
               st.add(s.charAt(i));
            }
            if(ch[i]==')'||ch[i]==']'||ch[i]=='}'){
                if(st.isEmpty()){
                    return false;
                }
                char top=st.pop();
                if(ch[i]==')'&&top!='('||ch[i]==']'&&top!='['||ch[i]=='}'&&top!='{'){
                    return false;
                }
            }

        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
}