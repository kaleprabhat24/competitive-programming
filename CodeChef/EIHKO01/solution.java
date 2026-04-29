class Solution {
    public long calculateUniquePaths(int rowCount, int columnCount) {
        int n = rowCount + columnCount - 2;
        int r = Math.min(rowCount - 1, columnCount - 1);

        long res = 1;

        for (int i = 1; i <= r; i++) {
            res = res * (n - r + i) / i;
        }

        return res;
    }
}