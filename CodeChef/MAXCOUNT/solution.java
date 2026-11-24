
class Solution {
    public int[] mostFrequent(int N, int[] A) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < N; i++) {
            freq.put(A[i], freq.getOrDefault(A[i], 0) + 1);
        }

        int bestElement = Integer.MAX_VALUE;
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount || (count == maxCount && element < bestElement)) {
                maxCount = count;
                bestElement = element;
            }
        }

        return new int[]{bestElement, maxCount};
    }
}
