class Solution {
    public String sortVowels(String s) {
        int arr[]=new int[10];
        char ch[]=s.toCharArray();
        for(char c:ch){
            int x="AEIOUaeiou".indexOf(c);
            if(x!=-1){
                arr[x]++;
            }
        }

        int k=0;
        //to keep track of index of the vowel  ??
        for(int i=0;i<ch.length;i++){
            if(vow(Character.toLowerCase(ch[i]))){
                while(k<10 && arr[k]==0){
                    k++;
                }
                if(k<10){
                    ch[i]=findchar(k);
                    arr[k]--;
                }
            }
        }
        return new String(ch);
    }
    public boolean vow(char ch){
        return "aeiou".indexOf(ch)==-1?false:true;
    }

    public char findchar(int k){
        char ab[]={'A','E','I','O','U','a','e','i','o','u'};
        return ab[k];
    }
}