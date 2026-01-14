class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>>ans=new ArrayList<>();
        if(k==0 || nums1.length==0 || nums2.length==0) return ans;
        PriorityQueue<int[]>pq=new PriorityQueue<>(
            (a,b) -> ((nums1[a[0]]+nums2[a[1]]) - (nums1[b[0]]+nums2[b[1]]))
        );
        for(int i=0;i<Math.min(k,nums1.length);i++){
            pq.add(new int[]{i,0});
        }
        while(k-- >0 && !pq.isEmpty()){
            int arr[]=pq.poll();
            int a=arr[0];
            int b=arr[1];

            ans.add(List.of(nums1[a],nums2[b]));

            if(b+1<nums2.length){
                pq.add(new int[]{a,b+1});
            }
        }
        return ans;

    }
}