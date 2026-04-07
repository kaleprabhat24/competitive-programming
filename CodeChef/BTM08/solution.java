import java.util.*;

public class Main {
    public static void main(String[] args) {
        int A, B;
        A = 5; // 5 = 101 in Binary
        B = 11; // 11 = 1011 in Binary

        int XOR = A ^ B; // 0101 ^ 1011

        System.out.println("The Bitwise XOR is: " + XOR);
    }
}