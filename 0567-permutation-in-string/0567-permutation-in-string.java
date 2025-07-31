class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int str1[]=new int[26];
        int str2[]=new int[26];
        for(int i=0;i<s1.length();i++){
            str1[s1.charAt(i)-'a']++;
            str2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(str1,str2)) return true;
        for(int i=s1.length();i<s2.length();i++){
            str2[s2.charAt(i-s1.length())-'a']--;
            str2[s2.charAt(i)-'a']++;

            if(Arrays.equals(str1,str2)) return true;
        }
        return false;
    }
}