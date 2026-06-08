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
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static String hackerrankInString(String s) {
        String target = "hackerrank";
        int targetIndex = 0;
        int targetLength = target.length();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target.charAt(targetIndex)) {
                targetIndex++;
            }
            if (targetIndex == targetLength) {
                return "YES";
            }
        }

        return "NO";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        String outputPath = System.getenv("OUTPUT_PATH");
        BufferedWriter bufferedWriter;
        if (outputPath == null) {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        } else {
            bufferedWriter = new BufferedWriter(new FileWriter(outputPath));
        }

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.hackerrankInString(s);

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
