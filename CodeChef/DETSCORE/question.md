# Determine the Score Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-07-27 |

---

## Problem Statement

### Determine the Score

Chef appeared for a placement test.

There is a problem worth XXX points. Chef finds out that the problem has exactly 101010 test cases. It is known that each test case is worth the same number of points.

Chef passes NNN test cases among them. Determine the score Chef will get.

**NOTE:** See sample explanation for more clarity.

### Input Format

- First line will contain TTT, number of test cases. Then the test cases follow.

- Each test case contains of a single line of input, two integers XXX and NNN, the total points for the problem and the number of test cases which pass for Chef's solution.

### Output Format

For each test case, output the points scored by Chef.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 10≤X≤20010 \leq X \leq 20010≤X≤200

- 0≤N≤100 \leq N \leq 100≤N≤10

- XXX is a multiple of 101010.

### Sample 1:

Input

Output

```
4
10 3
100 10
130 4
70 0

```

```
3
100
52
0

```

### Explanation:

**Test Case 111:** The problem is worth 101010 points and since there are 101010 test cases, each test case is worth 111 point. Since Chef passes 333 test cases, his score will be 1⋅3=31 \cdot 3 = 31⋅3=3 points.

**Test Case 222:** The problem is worth 100100100 points and since there are 101010 test cases, each test case is worth 101010 points. Since Chef passes all the 101010 test cases, his score will be 10⋅10=10010 \cdot 10 = 10010⋅10=100 points.

**Test Case 333:** The problem is worth 130130130 points and since there are 101010 test cases, each test case is worth 131313 points. Since Chef passes 444 test cases, his score will be 13⋅4=5213 \cdot 4 = 5213⋅4=52 points.

**Test Case 444:** The problem is worth 707070 points and since there are 101010 test cases, each test case is worth 777 points. Since Chef passes 000 test cases, his score will be 7⋅0=07 \cdot 0 = 07⋅0=0 points.
