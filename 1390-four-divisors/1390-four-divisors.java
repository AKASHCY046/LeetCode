class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int x:nums){
            sum+=find(x);
        }
        return sum;
    }
    public int find(int x){
        int sum=1+x;
        int co=2;
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0){
                sum+=(i==x/i)?i:(i+ (x/i));
                co+=(i==x/i)?1:2;
            }
        }
        return co==4 ? sum : 0;
    }
}