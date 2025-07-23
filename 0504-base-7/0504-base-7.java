class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        StringBuilder al=new StringBuilder();
        int x=0;
        if(num<0){
            x=1;
            num=num*-1;
        }
        while(num!=0){
            al.append(num%7);
            num=num/7;
        }
        return (x==1)?"-"+al.reverse().toString():al.reverse().toString();
    }
}