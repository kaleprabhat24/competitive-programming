            boolean[] isPrimeRange = new boolean[(int) (n - m + 1)];
            Arrays.fill(isPrimeRange, true);

            for (int p : basePrimes) {
                long prime = p;

                if (prime * prime > n)
                    break;

                long start = Math.max(prime * prime,
                        ((m + prime - 1) / prime) * prime);

                for (long j = start; j <= n; j += prime) {
                    isPrimeRange[(int) (j - m)] = false;
                }
            }

            if (m == 1) {
                isPrimeRange[0] = false;
            }

            for (int i = 0; i < isPrimeRange.length; i++) {
                if (isPrimeRange[i]) {
                    sb.append(m + i).append('\n');
                }
            }

            sb.append('\n');
        }

        System.out.print(sb);
    }
}