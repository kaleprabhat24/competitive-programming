    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                
                // Get the parity of digitSum(N)
                int parityN = getDigitSumParity(n);
                
                // Check if N + 1 works
                if (getDigitSumParity(n + 1) != parityN) {
                    System.out.println(n + 1);
                } else {
                    // If N + 1 has the same parity, N + 2 is guaranteed to have a different one
                    System.out.println(n + 2);
                }
            }
        }
        sc.close();
    }
    
    // Helper method to return 0 for Even and 1 for Odd digit sum
    private static int getDigitSumParity(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum % 2;
    }
}
