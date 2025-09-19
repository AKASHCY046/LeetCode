class Solution {
    public boolean checkDivisibility(int n) {
        return n%((find(n,true))+(find(n,false)))==0;
    }
    public int find(int n,boolean x){
        if(x){
            int sum=0;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            return sum;
        }
        int pr=1;
            while(n>0){
                pr*=n%10;
                n/=10;
            }
            return pr;
        
    }
}