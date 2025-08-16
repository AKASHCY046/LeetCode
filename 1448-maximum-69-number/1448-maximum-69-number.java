class Solution {
    public int maximum69Number (int num) {
        String str=Integer.toString(num);
        if(str.indexOf('6')==-1){
            return num;
        }
        else{
            str=(str.substring(0,str.indexOf('6'))+'9'+(str.substring(str.indexOf('6')+1)));
        }
        return Integer.parseInt(str);
        
    }
}