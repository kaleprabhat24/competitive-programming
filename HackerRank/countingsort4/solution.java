import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Fast I/O using standard BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        if (line == null) return;
        int n = Integer.parseInt(line.trim());

        // HackerRank constraints state integer keys are between 0 and 99
        StringBuilder[] buckets = new StringBuilder[100];
        for (int i = 0; i < 100; i++) {
            buckets[i] = new StringBuilder();
        }

        int half = n / 2;

        // Process inputs sequentially to guarantee O(N) time and O(1) parsing overhead
        for (int i = 0; i < n; i++) {
            line = br.readLine();
            if (line == null) break;

            // Find the space delimiter manually to avoid slow String.split() regex engines
            int spaceIdx = line.indexOf(' ');
            int key = Integer.parseInt(line.substring(0, spaceIdx));

            // Elements in the first half of the array are replaced with "-"
            if (i < half) {
                buckets[key].append("- ");
            } else {
                buckets[key].append(line.substring(spaceIdx + 1)).append(" ");
            }
        }

        // Fast I/O streaming via BufferedWriter to avoid standard out-stream blocking
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 100; i++) {
            if (buckets[i].length() > 0) {
                bw.write(buckets[i].toString());
            }
        }
        
        bw.newLine();
        bw.flush();
    }
}
