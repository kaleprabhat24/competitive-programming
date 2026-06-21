                for (int j = 0; j < n; j++) {
                    goals[j] = sc.nextInt();
                }
                
                // Read fouls
                for (int j = 0; j < n; j++) {
                    fouls[j] = sc.nextInt();
                }
                
                int maxPoints = 0;
                
                // Calculate points for each player
                for (int j = 0; j < n; j++) {
                    int points = (goals[j] * 20) - (fouls[j] * 10);
                    
                    // If points are negative, it's considered 0
                    if (points < 0) {
                        points = 0;
                    }
                    
                    // Keep track of the highest points achieved
                    if (points > maxPoints) {
                        maxPoints = points;
                    }
                }
                
                System.out.println(maxPoints);
            }
        }
        sc.close();
    }
}
