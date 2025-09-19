class Solution {
    public int clumsy(int n) {
        Stack<Integer>st=new Stack<>();
        st.add(n);
        n--;
        int index=0;
        while(n>0){
            if(index%4==0){
                st.push(st.pop()*(n));
            }
            else if(index%4==1){
                st.push(st.pop()/(n));
            }
            else if(index%4==2){
                st.push(n);
            }
            else{
                st.push(-n);
            }
            index++;
            n--;
        }
        int ans=0;
        for(int x:st){
            ans+=x;
        }
        return ans;
    }
}