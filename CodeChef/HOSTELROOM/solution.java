            
            while (T-- > 0) {
                int N = sc.nextInt();
                int X = sc.nextInt();
                
                int currentPeople = X;
                int maxPeople = X;
                
                for (int i = 0; i < N; i++) {
                    int event = sc.nextInt();
                    currentPeople += event;
                    
                    if (currentPeople > maxPeople) {
                        maxPeople = currentPeople;
                    }
                }
                
                System.out.println(maxPeople);
            }
        }
        
        sc.close();
    }
}
