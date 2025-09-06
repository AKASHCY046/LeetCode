class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer>al=new ArrayList<>();
        int rst=0;
        int cst=0;
        int rend=arr.length-1;
        int cend=arr[0].length-1;

        while(rst<=rend && cst<=cend){
            //firt row traversal
            for(int i=cst;i<=cend;i++){
                al.add(arr[rst][i]);
            }
            rst++;

            //down the col
            for(int i=rst;i<=rend;i++){
                al.add(arr[i][cend]);
            }
            cend--;

            //left to row
            if(rst<=rend){
            for(int i=cend;i>=cst;i--){
                al.add(arr[rend][i]);
            }
            rend--;
            }

            if(cst<=cend){
            //up to col
            for(int i=rend;i>=rst;i--){
                al.add(arr[i][cst]);
            }
            cst++;
            }

        }
        return al;
    }
}
/* 
          0 1 2
rst-> 0  [1 2 3]
      1  [4 5 6]
ren-> 2  [7 8 9]

*/