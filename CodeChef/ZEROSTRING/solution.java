class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt(); // Number of test cases
            while (t-- > 0) {
                int n = sc.nextInt(); // Length of string
                String s = sc.next();
                
                int ones = 0;
                int zeros = 0;
                
                // Count zeros and ones
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '1') {
                        ones++;
                    } else {
                        zeros++;
                    }
                }
                
                // If flipping and then deleting is cheaper
                if (ones > zeros) {
                    System.out.println(zeros + 1);
                } else {
                    // Otherwise, just delete the ones
                    System.out.println(ones);
                }
            }
        }
    }
}
