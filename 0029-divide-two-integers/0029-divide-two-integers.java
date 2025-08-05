class Solution {
    public int divide(int d, int v) {
        if(d==-2147483648 && v==-1){
            return 2147483647;

        }
        return (int)(d/v);
    }
}