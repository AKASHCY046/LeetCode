class Solution {
    public String reorganizeString(String s) {
        int arr[]=new int[26];
        StringBuilder st=new StringBuilder();
        int max=0;
        int lett=-1;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            if(arr[s.charAt(i)-'a']>max){
                max=arr[s.charAt(i)-'a'];
                lett=s.charAt(i)-'a';
            }
        }
        if(max>((s.length()+1)/2)){
            return "";
        }
        char res[]=new char[s.length()];
        int ind=0;
        while(arr[lett]>0){
            res[ind]=(char)(lett+'a');
            arr[lett]--;
            ind+=2;
        }

        for(int i=0;i<26;i++){
            while(arr[i]>0){
                if(ind>=s.length()){
                    ind=1;
                }
                res[ind]=(char)(i+'a');
                ind+=2;
                arr[i]--;
            }
        }
        return String.valueOf(res);

    }
}