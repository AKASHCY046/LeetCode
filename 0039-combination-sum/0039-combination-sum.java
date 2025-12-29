class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int tar) {
        Arrays.sort(arr);
        List<List<Integer>>ans=new ArrayList<>();
        find(arr,tar,ans,new ArrayList<>(),0);
        return ans;
    }
    public void find(int arr[],int tar,List<List<Integer>>ans,List<Integer>li,int st){
        if(tar<0) return;
        if(tar==0){
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i=st;i<arr.length;i++){
            li.add(arr[i]);
            find(arr,tar-arr[i],ans,li,i);
            li.remove(li.size()-1);
        }
    }
}