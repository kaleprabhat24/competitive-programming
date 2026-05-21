        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int A = sc.nextInt(); // Limak's limit
                int B = sc.nextInt(); // Bob's limit
                
                int candiesToEat = 1;
                
                while (true) {
                    // Limak's turn
                    if (A < candiesToEat) {
                        System.out.println("Bob");
                        break;
                    }
                    A -= candiesToEat;
                    candiesToEat++;
                    
                    // Bob's turn
                    if (B < candiesToEat) {
                        System.out.println("Limak");
                        break;
                    }
                    B -= candiesToEat;
                    candiesToEat++;
                }
            }
        }
        sc.close();
    }
}
