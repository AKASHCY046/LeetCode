class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int x1=0,x2=0;
        int c1=0,c2=0;

        for(int x:nums){
            if(x1==x){
                c1++;
            }
            else if(x2==x){
                c2++;
            }
            else if(c1==0){
                x1=x;
                c1=1;
            }
            else if(c2==0){
                x2=x;
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }

        c1=0;
        c2=0;
        for(int x:nums){
            if(x1==x) c1++;
            if(x2==x) c2++;
        }
        List<Integer>li=new ArrayList<>();
        if(c1>nums.length/3){
            li.add(x1);
        }
        if(x1!=x2 && c2>nums.length/3){
            li.add(x2);
        }
        return li;
    }
}