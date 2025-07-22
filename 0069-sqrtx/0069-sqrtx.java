class Solution {
    public int mySqrt(int x) {
        if(x==1 || x==0){
            return x;
        }
        return bsearch(0,x-1,x);
    }
    public int bsearch(int st,int end,int x){
        int mid=st+(end-st)/2;
        long a=(long)mid*mid;
        if(st>end){
            return end;
        }
        if(a<x){
            return bsearch(mid+1,end,x);
        }
        if(a>x){
            return bsearch(st,mid-1,x);
        }
        return mid;
    }

}