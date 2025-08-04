class Solution {
    public boolean containsDuplicate(int[] arr) {
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(hs.contains(arr[i])){
                return true;
            }
            hs.add(arr[i]);
        }
        return false;
    }
}