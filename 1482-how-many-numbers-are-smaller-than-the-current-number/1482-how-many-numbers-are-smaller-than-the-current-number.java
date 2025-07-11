class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer,Integer>hs=new HashMap<>();
        int arr[]=Arrays.copyOf(nums,nums.length);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(!hs.containsKey(arr[i]))
            hs.put(arr[i],i);
        }
        for(int i=0;i<arr.length;i++){
            nums[i]=hs.get(nums[i]);
        }
        return nums;
    }
}