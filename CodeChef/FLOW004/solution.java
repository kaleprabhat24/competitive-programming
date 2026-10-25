        // Check if there is an integer available to read
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Loop through all test cases
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                
                // The last digit is found using the modulo operator (%)
                int lastDigit = n % 10;
                
                // Reduce the number until only the first digit remains
                while (n >= 10) {
                    n /= 10;
                }
                int firstDigit = n;
                
                // Calculate and print the sum
                System.out.println(firstDigit + lastDigit);
            }
        }
        sc.close();
    }
}
