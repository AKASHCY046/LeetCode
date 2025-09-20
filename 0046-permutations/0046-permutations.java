class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return per(nums);
    }
    public List<List<Integer>>per(int nums[]){
        List<List<Integer>>al=new ArrayList<>();
        back(al,new ArrayList<>(),nums);
        return al;
    }
    public void back(List<List<Integer>>al,List<Integer>li,int arr[]){
        if(li.size()==arr.length){
            al.add(new ArrayList<>(li));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(li.contains(arr[i])){
                continue;
            }
            li.add(arr[i]);
            back(al,li,arr);
            li.remove(li.size()-1);
        }
    }
}