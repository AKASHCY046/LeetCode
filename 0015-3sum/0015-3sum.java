class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>>al=new ArrayList<>();
        Arrays.sort(arr);
        //HINT:this follows 2 pointer approch...





        int second=0;
        int third=0;
        for(int first=0;first<arr.length-1;first++){
            
            if(first>0 && arr[first]==arr[first-1]){
                continue;
            }
            second=first+1;
            third=arr.length-1;

            while(second<third){
                int sum=arr[first]+arr[second]+arr[third];
                if(sum>0){
                    third--;
                }
                else if(sum<0){
                    second++;
                }
                else{
                    al.add(Arrays.asList(arr[first],arr[second],arr[third]));
                    second++;
                    third--;
                    while(second<third && arr[second]==arr[second-1]){
                        second++;
                    }

                    while(second<third && arr[third]==arr[third+1]){
                        third--;
                    }
                }
            }
            
        }
        return al;
    }
}