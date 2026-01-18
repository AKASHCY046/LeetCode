class Solution {
    public String longestCommonPrefix(String[] str) {
        Arrays.sort(str);

        StringBuilder st=new StringBuilder();
        for(int i=0;i<Math.min(str[0].length(),str[str.length-1].length());i++){
            if(str[0].charAt(i)==str[str.length-1].charAt(i)){
                st.append(str[0].charAt(i));
            }
            else{
                break;
            }
        }
        return st.toString();
    }
}