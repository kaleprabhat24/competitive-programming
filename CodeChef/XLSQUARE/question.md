# Large Square Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-14 |

---

## Problem Statement

### Large Square

You are given NNN identical squares, each with side length AAA. All the squares have their sides parallel to the x−axisx-axisx−axis and y−axisy-axisy−axis. That is, the squares are not tilted. You have to take several (possibly, zero or all) squares and rearrange them to obtain a mega square. The mega square can't have any gap in the enclosed region or have overlapping squares. Also, you cannot rotate any square.

Output the side length of the largest mega square that you can obtain.

### Input Format

- The first line of input contains a single integer TTT denoting the number of test cases. The description of TTT test cases follows.

- The first and only line of each test case contains two space-separated integers N,AN, AN,A.

### Output Format

For each test case, print a single line containing one integer - the side length of the largest square you can obtain.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤N≤1051 \leq N \leq 10^51≤N≤105

- 1≤A≤1041 \leq A \leq 10^41≤A≤104

### Sample 1:

Input

Output

```
5
3 2
5 3
16 18
11 8
8 6

```

```
2
6
72
24
12

```

### Explanation:

**Test case 111:**  You can choose just one square to form the mega square. So the side length will be 222.

**Test case 222:**  You can choose 444 squares to form a mega square with side-length 2⋅A2 \cdot A2⋅A =6= 6=6.
