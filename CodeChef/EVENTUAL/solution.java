        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();
                
                // Count the frequency of each character
                int[] freq = new int[26];
                for (int i = 0; i < n; i++) {
                    freq[s.charAt(i) - 'a']++;
                }
                
                // Check if any character has an odd frequency
                boolean possible = true;
                for (int i = 0; i < 26; i++) {
                    if (freq[i] % 2 != 0) {
                        possible = false;
                        break;
                    }
                }
                
                if (possible) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
