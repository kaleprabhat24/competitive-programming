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
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
    // Write your code here
 int common = 0;
    int minLen = Math.min(s.length(), t.length());

    // Find common prefix length
    for (int i = 0; i < minLen; i++) {
        if (s.charAt(i) == t.charAt(i)) {
            common++;
        } else {
            break;
        }
    }

    int deletions = s.length() - common;
    int appends = t.length() - common;
    int minOps = deletions + appends;

    // Case 1: exact operations
    if (k == minOps) return "Yes";

    // Case 2: can delete whole string and rebuild
    if (k >= s.length() + t.length()) return "Yes";

    // Case 3: extra operations with even difference
    if (k > minOps && (k - minOps) % 2 == 0) return "Yes";

    return "No";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
