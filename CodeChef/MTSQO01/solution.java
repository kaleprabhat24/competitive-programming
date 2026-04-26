
    public int calculateMaxRobAmount(int[] arr) {
        int n = arr.length;
        if (n == 1) return arr[0];

        // case 1: exclude last house
        int case1 = rob(arr, 0, n - 2);

        // case 2: exclude first house
        int case2 = rob(arr, 1, n - 1);

        return Math.max(case1, case2);
    }

    private int rob(int[] arr, int start, int end) {
        int prev2 = 0, prev1 = 0;

        for (int i = start; i <= end; i++) {
            int pick = arr[i] + prev2;
            int notPick = prev1;
            int curr = Math.max(pick, notPick);

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}