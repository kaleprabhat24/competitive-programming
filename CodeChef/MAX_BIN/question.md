# Max Binary Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-07-15 |

---

## Problem Statement

### Max Binary

Chef has a **binary** strings SSS of length NNN, and an integer KKK.

Hitesh wants to **maximize** the *decimal representation* of SSS using KKK operations of the following type:

- Type 111: Insert 000 at any position in the string.

- Type 222: Change any 000 to 111.

Help Hitesh find the modified string with maximum possible decimal representation after performing **at most** KKK operations.

Note that the *decimal representation* of a binary string refers to the numeric value it represents when converted to the decimal number system. For instance, the decimal representation of 101101101 will be 555 (22+20)(2^2 + 2^0)(22+20), and that of 000110000110000110 will be 666 (22+21)(2^2 +2^1)(22+21)

### Input Format

- First line will contain TTT, number of test cases. Then the test cases follow.

- The first line of each test case contains two integers NNN and KKK.

- The second line contains the string SSS.

### Output Format

For each test case, output on a new line, the modified string with maximum possible decimal representation after performing **at most** KKK operations.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤N≤1061 \leq N \leq 10^61≤N≤106

- 1≤K≤1061 \leq K \leq 10^61≤K≤106

- SSS consists of 000 and 111 only.

- The sum of NNN and KKK over all test cases won't exceed 5⋅1065\cdot 10^65⋅106.

### Sample 1:

Input

Output

```
4
4 2
1101
6 3
001110
5 4
00110
3 1
000

```

```
110100
10111000
10110000
100

```

### Explanation:

**Test case 111:** We are allowed to perform two operations. We can perform both operations of type 111 to obtain 110100110100110100, having decimal value 525252.

**Test case 222:** We are allowed to perform three operations. We can perform two operations of type 111 to obtain 001110000011100000111000, and one operation of type 222 to obtain 101110001011100010111000, having decimal value 184184184.
