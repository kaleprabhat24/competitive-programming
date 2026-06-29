        int[] list1 = new int[n1];
        for(int i = 0; i < n1; i++) list1[i] = sc.nextInt();
        
        int[] list2 = new int[n2];
        for(int i = 0; i < n2; i++) list2[i] = sc.nextInt();
        
        int[] list3 = new int[n3];
        for(int i = 0; i < n3; i++) list3[i] = sc.nextInt();
        
        // Map to store frequency of each Voter ID
        Map<Integer, Integer> freq = new TreeMap<>();
        
        // Count occurrences
        for(int id : list1) freq.put(id, freq.getOrDefault(id, 0) + 1);
        for(int id : list2) freq.put(id, freq.getOrDefault(id, 0) + 1);
        for(int id : list3) freq.put(id, freq.getOrDefault(id, 0) + 1);
        
        // Filter IDs that appear in at least 2 lists
        List<Integer> finalVoters = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if(entry.getValue() >= 2) {
                finalVoters.add(entry.getKey());
            }
        }
        
        // Output results
        System.out.println(finalVoters.size());
        for(int id : finalVoters) {
            System.out.println(id);
        }
    }
}
