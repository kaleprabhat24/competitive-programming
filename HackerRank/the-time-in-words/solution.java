import java.io.*;
import java.util.*;

class Result {

    public static String timeInWords(int h, int m) {

        String[] words = {
            "", "one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "eleven", "twelve",
            "thirteen", "fourteen", "quarter", "sixteen",
            "seventeen", "eighteen", "nineteen", "twenty",
            "twenty one", "twenty two", "twenty three",
            "twenty four", "twenty five", "twenty six",
            "twenty seven", "twenty eight", "twenty nine"
        };

        if (m == 0) {
            return words[h] + " o' clock";
        } 
        else if (m == 15) {
            return "quarter past " + words[h];
        } 
        else if (m == 30) {
            return "half past " + words[h];
        } 
        else if (m == 45) {
            return "quarter to " + words[h + 1];
        } 
        else if (m < 30) {
            String minute = (m == 1) ? " minute" : " minutes";
            return words[m] + minute + " past " + words[h];
        } 
        else {
            int rem = 60 - m;
            String minute = (rem == 1) ? " minute" : " minutes";
            return words[rem] + minute + " to " + words[h + 1];
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int h = Integer.parseInt(bufferedReader.readLine().trim());
        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
