import java.io.*;
import java.util.*;

public class Solution {

    public static int minimumNumber(int n, String password) {
        // Track the presence of each required character group
        boolean hasDigit = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;
        
        String specialCharacters = "!@#$%^&*()-+";

        // Check each character in the password
        for (int i = 0; i < n; i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (specialCharacters.indexOf(c) != -1) {
                hasSpecial = true;
            }
        }

        // Count how many character types are missing
        int missingTypes = 0;
        if (!hasDigit) missingTypes++;
        if (!hasLower) missingTypes++;
        if (!hasUpper) missingTypes++;
        if (!hasSpecial) missingTypes++;

        // Calculate characters needed to reach minimum length of 6
        int missingLength = Math.max(0, 6 - n);

        // The answer is the maximum of the two constraints
        return Math.max(missingTypes, missingLength);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String password = scanner.next();
        
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        
        scanner.close();
    }
}
