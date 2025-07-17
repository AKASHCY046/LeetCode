class Solution {
    public int minimumChairs(String s) {
        int e=0;
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='E'){
                e++;
                if(c<e){
                    c=e;
                }
            }
            else{
                e--;
            }
        }
        return c;
        
    }
}