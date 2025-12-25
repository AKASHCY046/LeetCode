class Solution {
    public int integerReplacement(int n) {
        return find((long)n,0);
    }
    public int find(long n,int c){
        if(n==1){
            return c;
        }
        if(n%2==0){
            return find(n/2,c+1);
        }
        if(n==3) return find(n-1,c+1);
        if((n&3)==3) return find(n+1,c+1);
        
        return find(n-1,c+1);
    }
}