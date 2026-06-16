        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int n = sc.nextInt();
                // Array to store maximum scores for problems 1 to 8
                // Index 0 will remain unused for simpler 1-based indexing
                int[] maxScores = new int[9]; 
                
                for (int i = 0; i < n; i++) {
                    int p = sc.nextInt();
                    int s = sc.nextInt();
                    
                    // Only process if the problem is scorable (1 to 8)
                    if (p >= 1 && p <= 8) {
                        maxScores[p] = Math.max(maxScores[p], s);
                    }
                }
                
                // Calculate the total score by summing up the maximums
                int totalScore = 0;
                for (int i = 1; i <= 8; i++) {
                    totalScore += maxScores[i];
                }
                
                System.out.println(totalScore);
            }
        }
        sc.close();
    }
}
