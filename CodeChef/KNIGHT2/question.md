# Journey of the Knight Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-07-16 |

---

## Problem Statement

### Journey of the Knight

Chef has an 8×88 \times 88×8 chessboard. He placed a knight on the square (X1,Y1)(X_1, Y_1)(X1​,Y1​). Note that, the square at the intersection of the ithi^{th}ith row and jthj^{th}jth column is denoted by (i,j)(i, j)(i,j).

Chef wants to determine whether the knight can end up at the square (X2,Y2)(X_2, Y_2)(X2​,Y2​) in **exactly** 100100100 moves or not.

For reference, a knight can move to a square which is:

- One square horizontally and two squares vertically away from the current square, or

- One square vertically and two squares horizontally away from the current square

A visual description of this may be found here.

### Input Format

- The first line contains a single integer TTT — the number of test cases. Then the test cases follow.

- The first and only line of each test case contains 444 integers X1,Y1,X2,Y2X_1, Y_1, X_2, Y_2X1​,Y1​,X2​,Y2​ — where (X1,Y1)(X_1, Y_1)(X1​,Y1​) denotes the starting square of the knight and (X2,Y2)(X_2, Y_2)(X2​,Y2​) denotes the ending square of the knight.

### Output Format

For each test case, output `YES` if knight can move from (X1,Y1)(X_1, Y_1)(X1​,Y1​) to (X2,Y2)(X_2, Y_2)(X2​,Y2​) in **exactly** 100100100 moves. Otherwise, output `NO`.

You may print each character of `YES` and `NO` in uppercase or lowercase (for example, `yes`, `yEs`, `Yes` will be considered identical).

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤X1,Y1,X2,Y2≤81 \le X_1, Y_1, X_2, Y_2 \le 81≤X1​,Y1​,X2​,Y2​≤8

### Sample 1:

Input

Output

```
3
1 1 1 1
8 8 7 6
8 8 8 6

```

```
YES
NO
YES
```

### Explanation:

**Test Case 1:** Knight can first move to (2,3)(2, 3)(2,3) and then back to (1,1)(1, 1)(1,1). He can repeat this 505050 times and he will end up at (1,1)(1, 1)(1,1) after 100100100 moves.

**Test Case 2:** It can be proven that it is not possible for the knight to end at (7,6)(7, 6)(7,6) after 100100100 moves.

**Test Case 3:** Knight can first move to (6,7)(6, 7)(6,7) and then to (8,6)(8, 6)(8,6). After that, he can alternate between (6,7)(6, 7)(6,7) and (8,6)(8, 6)(8,6) for 494949 times and he will end up at (8,6)(8, 6)(8,6) after 100100100 moves.
