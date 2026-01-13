class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        PriorityQueue<Integer>qe=new PriorityQueue<>();
        for(int i=0;i<m;i++){
            qe.add(nums1[i]);
        }
        for(int y:nums2){
            qe.add(y);
        }
        int a=-1;
        while(!qe.isEmpty()){
            nums1[++a]=qe.poll();
        }
    }
}