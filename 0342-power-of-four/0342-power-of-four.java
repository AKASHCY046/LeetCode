class Solution {
    public boolean isPowerOfFour(int n) {
        /*
        if a n is pow of 4 then n=4*4*4...
        */
        while(n%4==0 && n>0){
            n/=4;
        }
        return n==1;
    }
}