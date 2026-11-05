        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int w = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                
                // Calculate total water after Z hours
                int totalWater = w + (y * z);
                
                // Determine the status of the bucket
                if (totalWater > x) {
                    System.out.println("overflow");
                } else if (totalWater == x) {
                    System.out.println("filled");
                } else {
                    System.out.println("unfilled");
                }
            }
        }
        sc.close();
    }
}
