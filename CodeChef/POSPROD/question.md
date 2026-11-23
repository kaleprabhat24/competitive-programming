# Positive Products Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-23 |

---

## Problem Statement

### Positive Products

You are given an array AAA of length NNN. Find the number of pairs of indices (i,j)(i,j)(i,j) such that

- 1≤i<j≤N1 \leq i \lt j \leq N1≤i<j≤N

- Ai⋅Aj>0A_i \cdot A_j \gt 0Ai​⋅Aj​>0

### Input Format

- The first line contains a single integer TTT - the number of test cases. Then the test cases follow.

- The first line of each test case contains an integer NNN - the size of the array AAA.

- The second line of each test case contains NNN space-separated integers A1,A2,…,ANA_1, A_2, \dots, A_NA1​,A2​,…,AN​ denoting the array AAA.

### Output Format

For each test case, output the number of pairs which satisfy the above conditions.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 2≤N≤1052 \leq N \leq 10^52≤N≤105

- −104≤Ai≤104-10^4 \leq A_i \leq 10^4−104≤Ai​≤104

- Sum of NNN over all test cases does not exceed 2⋅1052 \cdot 10^52⋅105

### Sample 1:

Input

Output

```
3
5
1 -3 0 2 -1
4
-1 -1 -1 -1
4
0 1 2 3

```

```
2
6
3

```

### Explanation:

**Test case 1:** The pairs which satisfy the conditions are (1,4)(1,4)(1,4) and (2,5)(2,5)(2,5).

**Test case 2:** The pairs which satisfy the conditions are (1,2)(1,2)(1,2), (1,3)(1,3)(1,3), (1,4)(1,4)(1,4), (2,3)(2,3)(2,3), (2,4)(2,4)(2,4) and (3,4)(3,4)(3,4).

**Test case 3:** The pairs which satisfy the conditions are (2,3)(2,3)(2,3), (2,4)(2,4)(2,4) and (3,4)(3,4)(3,4).
