class Solution {
    public int findClosest(int a, int b, int z) {
        return ((Math.abs(z-a)==Math.abs(z-b))?0:Math.abs(z-a)>Math.abs(z-b)?2:1);
    }
}