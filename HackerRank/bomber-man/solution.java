import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int r = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        List<String> grid = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            grid.add(sc.nextLine());
        }

        List<String> result = bomberMan(n, grid);
        for (String row : result) {
            System.out.println(row);
        }
        sc.close();
    }

    public static List<String> bomberMan(int n, List<String> grid) {
        int r = grid.size();
        int c = grid.get(0).length();

        // 1. If n is 1, the grid remains in its initial state.
        if (n == 1) return grid;

        // 2. If n is even (2, 4, 6...), the grid is completely filled with bombs.
        if (n % 2 == 0) return fullGrid(r, c);

        // 3. If n is odd, it follows a 4-second cycle:
        // n % 4 == 3: Grid after the first set of initial bombs detonate.
        // n % 4 == 1: Grid after the second set of bombs detonate.
        String[][] currentGrid = new String[r][c];
        for (int i = 0; i < r; i++) {
            currentGrid[i] = grid.get(i).split("");
        }

        String[][] state3 = detonate(currentGrid, r, c);
        if (n % 4 == 3) return formatOutput(state3);

        String[][] state5 = detonate(state3, r, c);
        return formatOutput(state5);
    }

    private static String[][] detonate(String[][] grid, int r, int c) {
        String[][] nextGrid = new String[r][c];
        for (String[] row : nextGrid) {
            Arrays.fill(row, "O");
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j].equals("O")) {
                    nextGrid[i][j] = ".";
                    if (i > 0) nextGrid[i - 1][j] = ".";
                    if (i < r - 1) nextGrid[i + 1][j] = ".";
                    if (j > 0) nextGrid[i][j - 1] = ".";
                    if (j < c - 1) nextGrid[i][j + 1] = ".";
                }
            }
        }
        return nextGrid;
    }

    private static List<String> fullGrid(int r, int c) {
        List<String> res = new ArrayList<>();
        char[] row = new char[c];
        Arrays.fill(row, 'O');
        for (int i = 0; i < r; i++) {
            res.add(new String(row));
        }
        return res;
    }

    private static List<String> formatOutput(String[][] grid) {
        List<String> res = new ArrayList<>();
        for (String[] row : grid) {
            res.add(String.join("", row));
        }
        return res;
    }
}
