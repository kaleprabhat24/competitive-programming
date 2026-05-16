            int t = sc.nextInt();
            
            while (t-- > 0) {
                int n = sc.nextInt();
                int sum = 0;
                
                // Read the binary array B and calculate its sum
                for (int i = 0; i < n; i++) {
                    sum += sc.nextInt();
                }
                
                // If the sum is even, output YES, else NO
                if (sum % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}