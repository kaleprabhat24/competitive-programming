                
                if (!possible) {
                    System.out.println(-1);
                    continue;
                }
                
                int trips = 1;
                int currentWeight = 0;
                
                for (int i = 0; i < N; i++) {
                    if (currentWeight + W[i] <= K) {
                        currentWeight += W[i];
                    } else {
                        trips++;
                        currentWeight = W[i];
                    }
                }
                
                System.out.println(trips);
            }
        }
        sc.close();
    }
}
