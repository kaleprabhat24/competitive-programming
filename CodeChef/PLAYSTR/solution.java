        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();
                String r = sc.next();
                
                int countS = 0;
                int countR = 0;
                
                // Count the number of '1's in both strings
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '1') {
                        countS++;
                    }
                    if (r.charAt(i) == '1') {
                        countR++;
                    }
                }
                
                // If frequencies match, S can be transformed into R
                if (countS == countR) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
