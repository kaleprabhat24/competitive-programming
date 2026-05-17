import java.util.*;

public class Solution {

    /**
     * Searches for a pattern P in a larger grid G.
     * @param G The large grid (list of strings)
     * @param P The pattern to find (list of strings)
     * @return "YES" if found, "NO" otherwise
     */
    public static String gridSearch(List<String> G, List<String> P) {
        int R = G.size();       // Number of rows in G
        int C = G.get(0).length(); // Number of columns in G
        int r = P.size();       // Number of rows in P
        int c = P.get(0).length(); // Number of columns in P

        // Iterate through possible top-left corners (i, j) of the pattern in the grid
        for (int i = 0; i <= R - r; i++) {
            String rowG = G.get(i);
            int j = rowG.indexOf(P.get(0));
            
            // Optimization: Use indexOf to find all occurrences of the first pattern row
            while (j != -1 && j <= C - c) {
                if (checkPattern(G, P, i, j)) {
                    return "YES";
                }
                // Look for the next occurrence of the first pattern row in the same grid row
                j = rowG.indexOf(P.get(0), j + 1);
            }
        }
        return "NO";
    }

    /**
     * Helper to verify if the full pattern exists starting at grid[startRow][startCol].
     */
    private static boolean checkPattern(List<String> G, List<String> P, int startRow, int startCol) {
        int r = P.size();
        int c = P.get(0).length();
        
        for (int i = 1; i < r; i++) {
            String gridSub = G.get(startRow + i).substring(startCol, startCol + c);
            if (!gridSub.equals(P.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int R = sc.nextInt();
            int C = sc.nextInt();
            List<String> G = new ArrayList<>();
            for (int i = 0; i < R; i++) G.add(sc.next());

            int r = sc.nextInt();
            int c = sc.nextInt();
            List<String> P = new ArrayList<>();
            for (int i = 0; i < r; i++) P.add(sc.next());

            System.out.println(gridSearch(G, P));
        }
        sc.close();
    }
}
