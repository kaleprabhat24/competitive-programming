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
     * Complete the 'funnyString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static String funnyString(String s) {
        int n = s.length();
        
        // Loop through the string and compare adjacent differences from both ends
        for (int i = 0; i < n - 1; i++) {
            // Difference from the front of the string
            int frontDiff = Math.abs(s.charAt(i) - s.charAt(i + 1));
            
            // Difference from the back of the string (mimicking the reversed string)
            int backDiff = Math.abs(s.charAt(n - 1 - i) - s.charAt(n - 2 - i));
            
            // If any adjacent difference mismatch occurs, it is not funny
            if (frontDiff != backDiff) {
                return "Not Funny";
            }
        }
        
        return "Funny";
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

                String result = Result.funnyString(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
