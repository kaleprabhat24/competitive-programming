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
     * Complete the 'luckBalance' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. 2D_INTEGER_ARRAY contests
     */

    public static int luckBalance(int k, List<List<Integer>> contests) {
        int totalLuck = 0;
        List<Integer> importantContests = new ArrayList<>();

        // Step 1: Segregate unimportant contests and collect important ones
        for (List<Integer> contest : contests) {
            int luck = contest.get(0);
            int importance = contest.get(1);

            if (importance == 0) {
                // Always lose unimportant contests to gain luck
                totalLuck += luck;
            } else {
                importantContests.add(luck);
            }
        }

        // Step 2: Sort important contests in ascending order
        Collections.sort(importantContests);

        // Step 3: Determine how many important contests she MUST win
        int totalImportant = importantContests.size();
        int mustWinCount = totalImportant - k;

        // Step 4: Process important contests
        for (int i = 0; i < totalImportant; i++) {
            if (i < mustWinCount) {
                // Win the smallest luck value contests (subtract luck)
                totalLuck -= importantContests.get(i);
            } else {
                // Lose the remaining higher value contests (add luck)
                totalLuck += importantContests.get(i);
            }
        }

        return totalLuck;
    }

}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> contests = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                contests.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.luckBalance(k, contests);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
