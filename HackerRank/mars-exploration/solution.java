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
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    public static int marsExploration(String s) {
        int changedCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // At index 1, 4, 7, etc. (i % 3 == 1), the character must be 'O'
            // At index 0, 2, 3, 5, etc., the character must be 'S'
            char expectedChar = (i % 3 == 1) ? 'O' : 'S';
            
            if (s.charAt(i) != expectedChar) {
                changedCount++;
            }
        }
        
        return changedCount;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
