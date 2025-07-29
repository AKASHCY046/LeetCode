class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>>li=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer>al=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    al.add(1);
                }
                else{
                    List<Integer>a1=li.get(i-1);
                    al.add(a1.get(j)+a1.get(j-1));
                }
            }
            li.add(al);
        }
        return li;
    }
}