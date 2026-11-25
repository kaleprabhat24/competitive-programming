            int hardThreshold = p / 10;

            int cakewalkCount = 0;
            int hardCount = 0;

            for (int i = 0; i < n; i++) {
                int solves = sc.nextInt();
                if (solves >= cakewalkThreshold) {
                    cakewalkCount++;
                }
                if (solves <= hardThreshold) {
                    hardCount++;
                }
            }

            if (cakewalkCount == 1 && hardCount == 2) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        sc.close();
    }
}
