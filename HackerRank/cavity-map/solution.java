import java.io.*;
import java.util.*;

public class Solution {

    public static List<String> cavityMap(List<String> grid) {
        int n = grid.size();
        // Create a copy of the grid to safely modify values
        String[] result = grid.toArray(new String[0]);

        // Loop only through internal cells (skip borders)
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                char current = grid.get(i).charAt(j);
                
                // Compare with original upper, lower, left, and right neighbors
                if (current > grid.get(i - 1).charAt(j) && 
                    current > grid.get(i + 1).charAt(j) && 
                    current > grid.get(i).charAt(j - 1) && 
                    current > grid.get(i).charAt(j + 1)) {
                    
                    // Replace the cavity cell with 'X' in the result copy
                    StringBuilder sb = new StringBuilder(result[i]);
                    sb.setCharAt(j, 'X');
                    result[i] = sb.toString();
                }
            }
        }
        return Arrays.asList(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        List<String> grid = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            grid.add(sc.next());
        }
        
        List<String> result = cavityMap(grid);
        
        // Print the output line by line as expected by HackerRank
        for (String s : result) {
            System.out.println(s);
        }
        sc.close();
    }
}
