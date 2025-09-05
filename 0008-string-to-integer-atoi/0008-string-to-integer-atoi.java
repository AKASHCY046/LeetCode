class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0) return 0;
        long result=0;
        int sign=1;
        int i=0;
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        if(s.charAt(0)=='+'){
            i++;
        }

        while(i<s.length() && Character.isDigit(s.charAt(i))){
            result=(result*10)+(s.charAt(i)-'0');
            i++;
            if(sign==-1 && result>Integer.MAX_VALUE) return Integer.MIN_VALUE;
            if(sign==1 && result>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        }
        return (int)(result*sign);
    }
}