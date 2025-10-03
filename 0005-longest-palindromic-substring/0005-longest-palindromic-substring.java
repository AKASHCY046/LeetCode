class Solution {
    public String longestPalindrome(String s) {

        if(s.length()<=1){
            return s;
        }
        //take a char and move towards its left and right unit both left and right are same
        String ans="";
        //there are 2 cases odd and even
        for(int i=1;i<s.length();i++){
            int st=i;
            int end=i;
            //for odd
            while(s.charAt(st)==s.charAt(end)){
                st--;
                end++;
                if(st==-1 || end==s.length()){
                    break;
                }
            }
            String pal=s.substring(st+1,end);
            if(ans.length()<pal.length()){
                ans=pal;
            }


            //for even
            st=i-1;
            end=i;
            while(s.charAt(st)==s.charAt(end)){
                st--;
                end++;

                if(st==-1 || end==s.length()){
                    break;
                }
            }
            pal=s.substring(st+1,end);
            if(ans.length()<pal.length()){
                ans=pal;
            }
        }
        return ans;
    }
}