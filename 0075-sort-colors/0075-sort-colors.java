class Solution {
    public void sortColors(int[] nums) {
        int o=0;
        int t=0;
        int th=0;
        for(int x:nums){
            if(x==0) o++;
            if(x==1) t++;
            if(x==2) th++;
        }
        int a=0;
        while(o!=0){
             nums[a++]=0;
            o--;
        }

        while(t!=0){
            nums[a++]=1;
            t--;
        }

        while(th!=0){
            nums[a++]=2;
            th--;
        }
    
    }
}