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
     * Complete the 'kaprekarNumbers' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER q
     */

    public static void kaprekarNumbers(int p, int q) {
    // Write your code here
List<Integer> result = new ArrayList<>();

    for (int num = p; num <= q; num++) {
        long square = (long) num * num;
        String sqStr = String.valueOf(square);

        int d = String.valueOf(num).length();

        String rightStr = sqStr.substring(Math.max(0, sqStr.length() - d));
        String leftStr = sqStr.substring(0, Math.max(0, sqStr.length() - d));

        long left = leftStr.isEmpty() ? 0 : Long.parseLong(leftStr);
        long right = rightStr.isEmpty() ? 0 : Long.parseLong(rightStr);

        if (left + right == num) {
            result.add(num);
        }
    }

    if (result.isEmpty()) {
        System.out.println("INVALID RANGE");
    } else {
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i != result.size() - 1) System.out.print(" ");
        }
    }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        Result.kaprekarNumbers(p, q);

        bufferedReader.close();
    }
}
