class Solution {
    public void nextPermutation(int[] arr) {
        //pair
        int n=arr.length;
        int i=n-2;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }

        if(i>=0){
            //j
            int j=n-1;
            while(arr[i]>=arr[j]){
                j--;
            }
            //swap
            swap(arr,i,j);
        }
        //rev
        rev(arr,i+1,n-1);
    }
    public void swap(int arr[],int st,int end){
        int temp=arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
    }

    public void rev(int arr[],int st,int end){
        while(st<end){
            swap(arr,st,end);
            st++;
            end--;
        }
    }
}

/*
        The next perm contains 4 major steps to solve it
        1.find the pair such that arr[i]<arr[i+1]
        2.find the j such that arr[i]<arr[j]
        3.swap i,j
        4.reverse from i+1
*/