# Different Consecutive Characters Practice Problem in Strings

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | cpp |
| **Solved On** | 2026-03-21 |

---

## Problem Statement

### Different Consecutive Characters 

Chef has a binary string SSS of length NNN. Chef can perform the following operation on SSS:

- Insert any character (000 or 111) at any position in SSS.

Find the minimum number of operations Chef needs to perform so that no two consecutive characters are same in SSS.

### Input Format

- The first line contains a single integer TTT — the number of test cases. Then the test cases follow.

- The first line of each test case contains an integer NNN — the length of the binary string SSS.

- The second line of each test case contains a binary string SSS of length NNN containing 000s and 111s only.

### Output Format

For each test case, output on a new line the minimum number of operations Chef needs to perform so that no two consecutive characters are same in SSS.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤N≤10001 \le N \le 10001≤N≤1000

### Sample 1:

Input

Output

```
3
2
11
4
0101
5
00100

```

```
1
0
2

```

### Explanation:

**Test case 1:** We can perform the following operations: 11→10‾111 \rightarrow 1\underline{0}111→10​1.

**Test case 2:** We do not need to perform any operations.

**Test case 3:** We can perform the following operations: 00100→01‾0100→010101‾000100 \rightarrow 0\underline{1}0100 \rightarrow 01010\underline{1}000100→01​0100→010101​0.
