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
     * Complete the 'separateNumbers' function below.
     *
     * The function accepts STRING s as parameter.
     */
    public static void separateNumbers(String s) {
        int n = s.length();
        
        // A valid sequence must have at least 2 numbers, 
        // so the first number can at most take half the string length.
        for (int len = 1; len <= n / 2; len++) {
            // Pick the substring for the first number
            String firstStr = s.substring(0, len);
            
            // Numbers with leading zeros are invalid (unless the number itself is just "0")
            if (firstStr.startsWith("0") && len > 1) {
                break;
            }
            
            // Use Long to prevent integer overflow during calculation
            long firstNumber = Long.parseLong(firstStr);
            long currentNumber = firstNumber;
            
            // Build the expected sequence matching string s
            StringBuilder sb = new StringBuilder(firstStr);
            while (sb.length() < n) {
                currentNumber++;
                sb.append(currentNumber);
            }
            
            // If the generated sequence perfectly matches s, we found our answer
            if (sb.toString().equals(s)) {
                System.out.println("YES " + firstNumber);
                return;
            }
        }
        
        // If no sequence matches after checking all valid starting lengths
        System.out.println("NO");
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                Result.separateNumbers(s);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
