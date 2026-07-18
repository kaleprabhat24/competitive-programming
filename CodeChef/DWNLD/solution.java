        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            int tc = sc.nextInt();
            for(int t = 0; t < tc; t++) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                
                int totalCost = 0;
                
                for(int i = 0; i < n; i++) {
                    int time = sc.nextInt();
                    int dataRate = sc.nextInt();
                    
                    if(k > 0) {
                        if(time <= k) {
                            k -= time;
                        } else {
                            int chargeableMinutes = time - k;
                            totalCost += chargeableMinutes * dataRate;
                            k = 0; // All free minutes are used
                        }
                    } else {
                        totalCost += time * dataRate;
                    }
                }
                System.out.println(totalCost);
            }
        }
        sc.close();
    }
}
