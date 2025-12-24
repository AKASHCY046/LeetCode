class Solution {
    public int largestRectangleArea(int[] arr) {
        int max=0;
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<=n;i++){
            int curr=(i==n)?0:arr[i];
            while(!st.isEmpty() && curr<arr[st.peek()]){

                int height=arr[st.pop()];
                int right=i;
                int left=(st.isEmpty()?-1:st.peek());
                int width=(right-left-1);
                max=Math.max(max,height*width);
            }
            st.push(i);
        }
        return max;
    }
}