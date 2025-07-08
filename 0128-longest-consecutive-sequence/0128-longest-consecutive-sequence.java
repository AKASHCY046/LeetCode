class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num); // O(1)
        }

        int maxLength = 0;

        for (int num : set) {  // iterate only unique elements
            // check only if num is the start of a sequence
            if (!set.contains(num - 1)) {
                int current = num;
                int streak = 1;

                while (set.contains(current + 1)) {
                    current++;
                    streak++;
                }

                maxLength = Math.max(maxLength, streak);
            }
        }

        return maxLength;
    }
}
