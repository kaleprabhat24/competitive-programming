        int t = sc.nextInt();
        
        while (t-- > 0) {
            int x = sc.nextInt();
            String s = sc.next();
            
            int carlsen = 0;
            int chef = 0;
            
            for (char c : s.toCharArray()) {
                if (c == 'C') {
                    carlsen += 2;
                } else if (c == 'N') {
                    chef += 2;
                } else { // 'D'
                    carlsen += 1;
                    chef += 1;
                }
            }
            
            if (carlsen > chef) {
                System.out.println(60 * x);
            } else if (carlsen < chef) {
                System.out.println(40 * x);
            } else {
                System.out.println(55 * x);
            }
        }
    }
}