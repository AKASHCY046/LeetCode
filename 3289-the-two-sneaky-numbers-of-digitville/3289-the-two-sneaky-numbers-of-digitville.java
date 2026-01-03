class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int crt = nums[i];
            if (crt < nums.length && nums[i] != nums[crt]) {
                int temp = nums[crt];
                nums[crt] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }
        int arr[] = new int[2];
        int k = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                arr[k++] = nums[j];
            }
        }
        return arr;
    }
}