class Solution {
    public int diagonalPrime(int[][] nums) {
        int prime =1;
        for(int i=0;i<nums.length;i++){
            if(nums[i][i]>prime && isprime(nums[i][i])){
                prime=nums[i][i];
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i][nums.length-1-i]>prime && isprime(nums[i][nums.length-1-i])){
                prime=nums[i][nums.length-1-i];
            }
        }
        return prime==1?0:prime;

    }
    public boolean isprime(int x){
        if(x<2){
            return false;
        }
        if(x==2){
            return true;
        }

        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0) return false;
        }
        return true;
    }
}
/*
00 01 02
10 11 12
20 21 22
*/