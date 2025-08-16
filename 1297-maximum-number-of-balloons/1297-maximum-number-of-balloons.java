class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=0;
        int a=0;
        int l=0;
        int o=0;
        int n=0;
        for(char ch:text.toCharArray()){
            if("balon".indexOf(ch)!=-1){
                if(ch=='b'){
                    b++;
                }
                else if(ch=='a'){
                    a++;
                }
                else if(ch=='o'){
                    o++;
                }
                else if(ch=='l'){
                    l++;
                }
                else if(ch=='n'){
                    n++;
                }
            }
        }
        int min=Integer.MAX_VALUE;
        min=Math.min(b,min);
        min=Math.min(a,min);
        min=Math.min(l/2,min);
        min=Math.min(o/2,min);
        min=Math.min(n,min);
        return min;

    }
}