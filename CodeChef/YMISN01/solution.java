class Solution {
    public long calculateWaysToClimb(int totalSteps) {
        if (totalSteps <= 2) return totalSteps;

        long prev2 = 1, prev1 = 2;

        for (int i = 3; i <= totalSteps; i++) {
            long curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}