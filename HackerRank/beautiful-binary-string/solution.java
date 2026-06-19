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
     * Complete the 'beautifulBinaryString' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING b as parameter.
     */

    public static int beautifulBinaryString(String b) {
        int steps = 0;
        int i = 0;
        
        // Loop through the string up to the point where a 3-character substring can exist
        while (i <= b.length() - 3) {
            // Check if the current substring matches "010"
            if (b.substring(i, i + 3).equals("010")) {
                steps++;
                // Skip 3 indices forward because changing the last '0' to '1'
                // completely eliminates this window and safely resets the next check
                i += 3;
            } else {
                i++;
            }
        }
        
        return steps;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String b = bufferedReader.readLine();

        int result = Result.beautifulBinaryString(b);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
