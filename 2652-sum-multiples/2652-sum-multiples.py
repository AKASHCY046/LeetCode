class Solution:
    def sumOfMultiples(self, n: int) -> int:
        def re(i):
            if i > n:
                return 0
            s = i if (i % 3 == 0 or i % 5 == 0 or i % 7 == 0) else 0
            return s + re(i + 1)
        return re(1)
