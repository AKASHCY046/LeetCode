class Solution {
    public int distanceBetweenBusStops(int[] dis, int start, int destination) {
        int sum1=0;
        int sum2=0;
        destination%=dis.length;
        for(int i=Math.min(start,destination);i<Math.max(start,destination);i++){
            sum1+=dis[i];
        }
        for(int i=Math.max(start,destination);i<dis.length;i++){
            sum2+=dis[i];
        }
        for(int i=0;i<Math.min(start,destination);i++){
            sum2+=dis[i];
        }
        return Math.min(sum1,sum2);
    }
}