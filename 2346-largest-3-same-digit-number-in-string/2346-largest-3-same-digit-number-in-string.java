class Solution {
    public String largestGoodInteger(String num) {
        String st[]={"999","888","777","666","555","444","333","222","111","000",};
        for(String x:st){
            if(num.contains(x)){
                return x;
            }
        }
        return "";
    }
}