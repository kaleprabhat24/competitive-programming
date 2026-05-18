import java.io.*;
import java.util.*;

public class Solution {
    public static String happyLadybugs(String b) {
        // Step 1: Count occurrences of each color (A-Z)
        int[] counts = new int[26];
        boolean hasUnderscore = false;
        
        for (char c : b.toCharArray()) {
            if (c == '_') {
                hasUnderscore = true;
            } else {
                counts[c - 'A']++;
            }
        }

        // Step 2: Check for lone ladybugs
        for (int count : counts) {
            if (count == 1) return "NO";
        }

        // Step 3: If no underscore, check if already happy
        if (!hasUnderscore) {
            for (int i = 0; i < b.length(); i++) {
                boolean happy = false;
                if (i > 0 && b.charAt(i) == b.charAt(i - 1)) happy = true;
                if (i < b.length() - 1 && b.charAt(i) == b.charAt(i + 1)) happy = true;
                
                if (!happy) return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int games = scanner.nextInt();
        while (games-- > 0) {
            int n = scanner.nextInt();
            String b = scanner.next();
            System.out.println(happyLadybugs(b));
        }
        scanner.close();
    }
}
