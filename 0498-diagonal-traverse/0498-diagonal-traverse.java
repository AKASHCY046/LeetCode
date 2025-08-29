class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int arr[]=new int[mat.length*mat[0].length];
        int k=0;
        int x=0;
        int y=0;
        int dia=0;
        for(int i=0;i<mat.length;i++){
            ArrayList<Integer>al=new ArrayList<>();
            k=0;
            x=i;
            while(x>=0 && k<mat[0].length){
                al.add(mat[x][k]);
                x--;
                k++;
            }
            if(dia%2==0){
                for(int b:al){
                    arr[y++]=b;
                }
            }
            else{
                for(int j=al.size()-1;j>=0;j--){
                    arr[y++]=al.get(j);
                }
            }
            dia++;
        }
        for(int i=1;i<mat[0].length;i++){
            ArrayList<Integer>al=new ArrayList<>();
            k=i;
            x=mat.length-1;
            while(k<mat[0].length && x>=0){
                al.add(mat[x--][k++]);
            }
            if(dia%2==0){
                for(int b:al){
                    arr[y++]=b;
                }
            }
            else{
                for(int j=al.size()-1;j>=0;j--){
                    arr[y++]=al.get(j);
                }
            }
            dia++;
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