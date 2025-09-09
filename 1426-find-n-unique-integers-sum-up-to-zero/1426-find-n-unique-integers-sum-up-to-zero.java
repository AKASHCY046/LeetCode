class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        int x = n / 2;
        x *= -1;
        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                arr[i] = x++;
            }
        }
        else{
            for (int i = 0; i < n; i++) {
                if(x==0){
                    x+=1;
                }
                arr[i] = x++;
            }
        }

        return arr;
    }
}