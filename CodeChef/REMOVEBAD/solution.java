
class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Read the number of test cases
        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] tokens = br.readLine().trim().split("\\s+");
            
            // Use a HashMap to store the frequency of each element
            HashMap<Integer, Integer> frequencyMap = new HashMap<>();
            int maxFrequency = 0;
            
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(tokens[i]);
                // Update the count of the current number
                int currentFrequency = frequencyMap.getOrDefault(num, 0) + 1;
                frequencyMap.put(num, currentFrequency);
                
                // Keep track of the highest frequency found so far
                if (currentFrequency > maxFrequency) {
                    maxFrequency = currentFrequency;
                }
            }
            
            // Minimum operations = total elements minus the count of the most frequent element
            System.out.println(n - maxFrequency);
        }
    }
}
