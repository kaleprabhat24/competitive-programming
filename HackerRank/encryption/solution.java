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
     * Complete the 'encryption' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String encryption(String s) {
    // Write your code here
 s = s.replaceAll(" ", "");
    int n = s.length();
    
    int rows = (int)Math.floor(Math.sqrt(n));
    int cols = (int)Math.ceil(Math.sqrt(n));
    
    if (rows * cols < n) rows++;
    
    StringBuilder result = new StringBuilder();
    
    for (int c = 0; c < cols; c++) {
        for (int r = 0; r < rows; r++) {
            int idx = r * cols + c;
            if (idx < n) {
                result.append(s.charAt(idx));
            }
        }
        if (c < cols - 1) result.append(" ");
    }
    
    return result.toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
