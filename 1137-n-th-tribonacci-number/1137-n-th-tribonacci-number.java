class Solution {
    public int tribonacci(int n) {
        if(n==0||n==1){
            return n;
        }
        if(n==2){
            return 1;
        }
        int a=0;
        int b=1;
        int c=1;
        n-=3;
        while(n>=0){
            int x=a+b+c;
            a=b;
            b=c;
            c=x;
            n--;
        }
        return c;
    }
}