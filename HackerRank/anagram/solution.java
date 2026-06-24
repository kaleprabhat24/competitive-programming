import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int anagram(String s) {
        int len = s.length();
        
        // If length is odd, it cannot be divided into two equal parts
        if (len % 2 != 0) {
            return -1;
        }

        int mid = len / 2;
        int[] charCounts = new int[26];

        // Increment counts for the first half
        for (int i = 0; i < mid; i++) {
            charCounts[s.charAt(i) - 'a']++;
        }

        // Decrement counts for the second half
        for (int i = mid; i < len; i++) {
            charCounts[s.charAt(i) - 'a']--;
        }

        // Count how many missing characters must be substituted
        int changesRequired = 0;
        for (int count : charCounts) {
            if (count > 0) {
                changesRequired += count;
            }
        }

        return changesRequired;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.anagram(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
