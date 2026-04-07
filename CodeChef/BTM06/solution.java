import java.util.*;

public class Main {

    public static void main(String[] args) {
        int A, B;
        A = 5; // 5 = 101 in Binary
        B = 11; // 11 = 1011 in Binary

        int AND = A & B; // 0101 & 1011
        int OR = A | B; // 0101 | 1011

        System.out.println("The Bitwise AND is: " + (A & B));
        System.out.println("The Bitwise OR is: " + (A | B));
    }
}