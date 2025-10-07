class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int prev[]=arr[0];
        List<int[]>ans=new ArrayList<>();
        for(int x[]:arr){
            if(prev[1]>=x[0]){
                prev[1]=Math.max(prev[1],x[1]);
            }
            else{
                ans.add(prev);
                prev=x;
            }
        }
        ans.add(prev);
        return ans.toArray(new int[ans.size()][]);
    }
}