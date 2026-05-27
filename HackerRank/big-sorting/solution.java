import java.io.*;
import java.util.*;

public class Solution {
    public static List<String> bigSorting(List<String> unsorted) {
        // Sort using a custom comparator
        Collections.sort(unsorted, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Step 1: Compare lengths
                if (s1.length() != s2.length()) {
                    return Integer.compare(s1.length(), s2.length());
                }
                // Step 2: Compare lexicographically if lengths match
                return s1.compareTo(s2);
            }
        });
        
        return unsorted;
    }

    public static void main(String[] args) throws IOException {
        // Using BufferedReader for optimal I/O speed with massive datasets
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());
        List<String> unsorted = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            unsorted.add(br.readLine().trim());
        }

        List<String> result = bigSorting(unsorted);

        for (String s : result) {
            bw.write(s);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
