                
                StringBuilder result = new StringBuilder();
                
                for (int i = 0; i < n; i++) {
                    int demand = sc.nextInt();
                    
                    // Fulfill withdrawal if enough units remain
                    if (k >= demand) {
                        k -= demand;
                        result.append("1");
                    } else {
                        result.append("0");
                    }
                }
                // Print binary pattern for the current test case
                System.out.println(result.toString());
            }
        }
        sc.close();
    }
}
