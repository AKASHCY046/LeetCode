class Solution {
    public List<List<Integer>> fourSum(int[] arr, int x) {
        List<List<Integer>>al=new ArrayList<>();
        Arrays.sort(arr);
        int third=0;
        int fourth=0;
        for(int first=0;first<arr.length-3;first++){
            if(first>0 && arr[first]==arr[first-1]){
                continue;
            }

            for(int second=first+1;second<arr.length-2;second++){
                if(second > first+1 && arr[second]==arr[second-1]){
                    continue;
                }
                third=second+1;
                fourth=arr.length-1;
                while(third<fourth){
                    long sum=(long)arr[first]+arr[second]+arr[third]+arr[fourth];
                    if(sum>x){
                        fourth--;
                    }
                    else if(sum<x){
                        third++;
                    }
                    else{
                        al.add(Arrays.asList(arr[first],arr[second],arr[third],arr[fourth]));
                        third++;
                        fourth--;

                        while(third<fourth && arr[third]==arr[third-1]){
                            third++;
                        }

                        while(third<fourth && arr[fourth]==arr[fourth+1]){
                            fourth--;
                        }
                    }
                }
            }

        }
        return al;
    }
}