class Solution {
    public int areaOfMaxDiagonal(int[][] dim) {
        double max=0;
        int area=0;
        for(int i=0;i<dim.length;i++){
            double val=Math.sqrt((dim[i][0]*dim[i][0])+(dim[i][1]*dim[i][1]));
            System.out.println(val +" "+(dim[i][0]*dim[i][1]));
            if(max<val){
                max=val;
                area=dim[i][0]*dim[i][1];
            }
            if(max==val){
                if(area<dim[i][0]*dim[i][1]){
                    area=dim[i][0]*dim[i][1];
                }
            }
        }
        return area;

    }
}
//00 01
//10 11
//20 21