            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(input[i]);
            }
            
            int maxDigitSum = 0;
            
            // Check all unique pairs (i, j) where i < j
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int product = a[i] * a[j];
                    int currentSum = getDigitSum(product);
                    
                    if (currentSum > maxDigitSum) {
                        maxDigitSum = currentSum;
                    }
                }
            }
            
            System.out.println(maxDigitSum);
        }
    }
    
    // Helper method to calculate the sum of digits of a number
    private static int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
