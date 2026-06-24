            // Frequency array for laptops 1 to 10
            int[] counts = new int[11];
            
            for (int i = 0; i != N; i++) {
                int laptopId = sc.nextInt();
                counts[laptopId]++;
            }
            
            int maxVotes = 0;
            int chosenLaptop = -1;
            boolean isConfused = false;
            
            // Find the maximum recommendation count
            for (int i = 1; i != 11; i++) {
                if (counts[i] > maxVotes) {
                    maxVotes = counts[i];
                    chosenLaptop = i;
                    isConfused = false; // Reset tie tracker on a new strict maximum
                } else if (counts[i] == maxVotes && maxVotes != 0) {
                    isConfused = true; // Tie discovered
                }
            }
            
            if (isConfused) {
                System.out.println("CONFUSED");
            } else {
                System.out.println(chosenLaptop);
            }
        }
        sc.close();
    }
}
