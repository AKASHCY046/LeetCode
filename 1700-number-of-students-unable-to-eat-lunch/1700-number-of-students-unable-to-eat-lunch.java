class Solution {
    public int countStudents(int[] students, int[] arr) {
        Queue<Integer>qe=new LinkedList<>();
        for(int x:students){
            qe.add(x);
        }
        int i=0;
        int fails=0;
        while(!qe.isEmpty() && fails<qe.size()){
            int a=qe.poll();
            if(arr[i]!=a){
                fails++;
                qe.add(a);
            }
            else{
                fails=0;
                i++;
            }
        }
        return qe.isEmpty()?0:qe.size();
    }
}