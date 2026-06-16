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
     * Complete the 'gemstones' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY arr as parameter.
     */

    public static int gemstones(List<String> arr) {
        // Initialize commonMask with 1s for all 26 lowercase English letters
        int commonMask = (1 << 26) - 1;

        for (String rock : arr) {
            int currentRockMask = 0;
            
            // Build the bitmask for the current rock
            for (int i = 0; i < rock.length(); i++) {
                currentRockMask |= (1 << (rock.charAt(i) - 'a'));
            }
            
            // Keep only the minerals that are present in both
            commonMask &= currentRockMask;
            
            // Optimization: If no minerals are common, we can stop early
            if (commonMask == 0) {
                return 0;
            }
        }

        // Count the number of set bits (1s) in the final mask
        return Integer.bitCount(commonMask);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arr = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int result = Result.gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
