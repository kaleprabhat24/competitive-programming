import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Loop through each testcase
            while (t-- > 0) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                
                // Calculate and print the final population
                int finalPopulation = x - y + z;
                System.out.println(finalPopulation);
            }
        }
        sc.close();
    }
}
