    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int currentSum = x + y;
                
                // Find the first prime number greater than currentSum
                int nextPrime = currentSum + 1;
                while (!isPrime(nextPrime)) {
                    nextPrime++;
                }
                
                // The minimum potatoes needed from the third field is the difference
                System.out.println(nextPrime - currentSum);
            }
        }
        sc.close();
    }
}
