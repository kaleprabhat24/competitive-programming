        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());

            long totalTime = 0;
            long currentM = m;

            while (n > 0) {
                // If the number of problems is odd, solve (N + 1) / 2. Otherwise, solve N / 2.
                long problemsToSolve = (n % 2 == 0) ? (n / 2) : (n + 1) / 2;

                // Time spent solving these problems
                totalTime += problemsToSolve * currentM;

                // Subtract solved problems from the total
                n -= problemsToSolve;

                // If problems are left, add the break time and double the speed (time per problem)
                if (n > 0) {
                    totalTime += b;
                    currentM *= 2;
                }
            }

            System.out.println(totalTime);
        }
    }
}
