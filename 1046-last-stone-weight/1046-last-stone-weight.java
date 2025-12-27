class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> qe = new PriorityQueue<>((a, b) -> b - a);
        for (int x : stones) {
            qe.add(x);
        }
        while (qe.size() > 1) {
            int a = qe.poll();
            int b = qe.poll();

            if (a != b) {
                qe.add(Math.abs(a - b));
            }
        }
        return qe.isEmpty() ? 0 : qe.poll();
    }
}