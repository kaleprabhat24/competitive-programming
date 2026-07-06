                long powerB = getDigitSum(b);
                
                if (powerA > powerB) {
                    chefPoints++;
                } else if (powerB > powerA) {
                    mortyPoints++;
                } else {
                    chefPoints++;
                    mortyPoints++;
                }
            }
            
            if (chefPoints > mortyPoints) {
                System.out.println("0 " + chefPoints);
            } else if (mortyPoints > chefPoints) {
                System.out.println("1 " + mortyPoints);
            } else {
                System.out.println("2 " + chefPoints);
            }
        }
        sc.close();
    }
    
    private static long getDigitSum(long num) {
        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
