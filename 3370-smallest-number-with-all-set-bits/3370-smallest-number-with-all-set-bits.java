class Solution {
    public int smallestNumber(int n) {
        while(true){
            if(n%2!=0){
                if(Integer.toString(n,2).indexOf("0")==-1){
                    return n;
                }
            }
            n++;
        }
    }
    
}