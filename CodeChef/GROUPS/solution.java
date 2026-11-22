        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            
            while (T-- > 0) {
                String S = sc.next();
                int groups = 0;
                
                for (int i = 0; i < S.length(); i++) {
                    // A new group starts if the current seat has someone ('1')
                    // AND it's either the first seat or the previous seat was empty ('0')
                    if (S.charAt(i) == '1' && (i == 0 || S.charAt(i - 1) == '0')) {
                        groups++;
                    }
                }
                
                System.out.println(groups);
            }
        }
        
        sc.close();
    }
}
