import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> serviceLane(List<Integer> width, List<List<Integer>> cases) {

        List<Integer> ans = new ArrayList<>();

        for (List<Integer> c : cases) {
            int start = c.get(0);
            int end = c.get(1);

            int minWidth = Integer.MAX_VALUE;

            for (int i = start; i <= end; i++) {
                minWidth = Math.min(minWidth, width.get(i));
            }

            ans.add(minWidth);
        }

        return ans;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);
        int t = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> width = Stream.of(bufferedReader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<List<Integer>> cases = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            cases.add(
                Stream.of(bufferedReader.readLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(toList())
            );
        }

        List<Integer> result = Result.serviceLane(width, cases);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
        );

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
