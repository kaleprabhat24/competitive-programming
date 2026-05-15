import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                // Read Dragon's scores: DSA, TOC, DM
                int dsa1 = sc.nextInt();
                int toc1 = sc.nextInt();
                int dm1 = sc.nextInt();
                
                // Read Sloth's scores: DSA, TOC, DM
                int dsa2 = sc.nextInt();
                int toc2 = sc.nextInt();
                int dm2 = sc.nextInt();
                
                // Calculate total scores
                int total1 = dsa1 + toc1 + dm1;