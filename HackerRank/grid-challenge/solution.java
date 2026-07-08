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
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */
    public static String gridChallenge(List<String> grid) {
        int numRows = grid.size();
        int numCols = grid.get(0).length();
        
        char[][] sortedGrid = new char[numRows][numCols];
        
        // 1. Sort every row alphabetically
        for (int i = 0; i < numRows; i++) {
            char[] rowChars = grid.get(i).toCharArray();
            Arrays.sort(rowChars);
            sortedGrid[i] = rowChars;
        }
        
        // 2. Check if all columns are sorted vertically
        for (int col = 0; col < numCols; col++) {
            for (int row = 1; row < numRows; row++) {
                if (sortedGrid[row][col] < sortedGrid[row - 1][col]) {
                    return "NO";
                }
            }
        }
        
        return "YES";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        // Fix: Fallback to System.out if OUTPUT_PATH environment variable is missing
        String outputPath = System.getenv("OUTPUT_PATH");
        BufferedWriter bufferedWriter = (outputPath != null) ? 
            new BufferedWriter(new FileWriter(outputPath)) : 
            new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<String> grid = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                    .collect(toList());

                String result = Result.gridChallenge(grid);

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
