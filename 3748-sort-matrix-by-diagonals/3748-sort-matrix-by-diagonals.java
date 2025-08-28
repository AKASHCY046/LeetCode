class Solution {
    public int[][] sortMatrix(int[][] arr) {
        int n=arr.length;
        int a=0;
        int b=0;
        for(int i=n-1;i>=0;i--){
            ArrayList<Integer>al=new ArrayList<>();
             a=i;
             b=0;
            while(a<n && b<n){
                al.add(arr[a][b]);
                a++;
                b++;
            }
            Collections.sort(al, Collections.reverseOrder());
             a=i;
             b=0;
            for(int x:al){
                arr[a][b]=x;
                a++;
                b++;
            }
        }
        for(int i=1;i<n;i++){
             a =0;
             b=i;
            ArrayList<Integer>al=new ArrayList<>();
            while(a<n && b<n){
                al.add(arr[a][b]);
                a++;
                b++;
            }
            Collections.sort(al);
             a =0;
             b=i;
            for(int x:al){
                arr[a][b]=x;
                a++;
                b++;
            }
        }
        return arr;
    }
}
/*
00 01 02 03
10 11 12 13
20 21 22 23
30 31 32 33
*/