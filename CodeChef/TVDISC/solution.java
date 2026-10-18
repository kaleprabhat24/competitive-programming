        int T = sc.nextInt();
        
        while (T-- > 0) {
            int A = sc.nextInt(); // Price of 1st TV
            int B = sc.nextInt(); // Price of 2nd TV
            int C = sc.nextInt(); // Discount on 1st TV
            int D = sc.nextInt(); // Discount on 2nd TV
            
            // Calculate final prices
            int finalPrice1 = A - C;
            int finalPrice2 = B - D;
            
            // Compare prices and print the result
            if (finalPrice1 < finalPrice2) {
                System.out.println("First");
            } else if (finalPrice2 < finalPrice1) {
                System.out.println("Second");
            } else {
                System.out.println("Any");
            }
        }
        sc.close();
    }
}
