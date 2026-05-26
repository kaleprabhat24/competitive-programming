import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // rows
        int n = sc.nextInt(); // cols
        int r = sc.nextInt(); // rotations
        
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        rotateMatrix(matrix, m, n, r);
        printMatrix(matrix);
    }

    static void rotateMatrix(int[][] matrix, int m, int n, int r) {
        int layers = Math.min(m, n) / 2;
        
        for (int layer = 0; layer < layers; layer++) {
            List<Integer> list = new ArrayList<>();
            
            // Extract layer elements (anti-clockwise)
            for (int j = layer; j < n - layer - 1; j++) list.add(matrix[layer][j]); // Top
            for (int i = layer; i < m - layer - 1; i++) list.add(matrix[i][n - layer - 1]); // Right
            for (int j = n - layer - 1; j > layer; j--) list.add(matrix[m - layer - 1][j]); // Bottom
            for (int i = m - layer - 1; i > layer; i--) list.add(matrix[i][layer]); // Left
            
            int size = list.size();
            int shift = r % size; // Only shift by the remainder
            
            // Put elements back in shifted positions
            int current = shift;
            for (int j = layer; j < n - layer - 1; j++) matrix[layer][j] = list.get(current++ % size);
            for (int i = layer; i < m - layer - 1; i++) matrix[i][n - layer - 1] = list.get(current++ % size);
            for (int j = n - layer - 1; j > layer; j--) matrix[m - layer - 1][j] = list.get(current++ % size);
            for (int i = m - layer - 1; i > layer; i--) matrix[i][layer] = list.get(current++ % size);
        }
    }

    static void printMatrix(int[][] matrix) {
        StringBuilder sb = new StringBuilder();
        for (int[] row : matrix) {
            for (int val : row) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
