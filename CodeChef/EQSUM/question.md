# Practice Coding Problem

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-04-01 |

---

## Problem Statement

### Equal Difference

You are given an array AAA of NNN integers.

Count the number of pairs (i,j)(i, j)(i,j) such that:

- 1≤i<j≤N1 \le i < j \le N1≤i<j≤N

- Ai−Aj=i−jA_i - A_j = i - jAi​−Aj​=i−j

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of multiple lines of input.

The first line contains an integer NNN - the size of the array.

- The second line contains NNN integers - A1,A2,…,ANA_1, A_2, \ldots, A_NA1​,A2​,…,AN​.

### Output Format

For each test case, output on a new line the number of valid pairs.

### Constraints

- 1≤T≤1041 \le T \le 10^41≤T≤104

- 2≤N≤4⋅1042 \le N \le 4 \cdot 10^42≤N≤4⋅104

- 1≤Ai≤N1 \le A_i \le N1≤Ai​≤N

- The sum of NNN over all test cases does not exceed 2⋅1052 \cdot 10^52⋅105.

### Sample 1:

Input

Output

```
3
3
1 2 3
3
3 2 1
5
1 1 3 3 4

```

```
3
0
4
```

### Explanation:

**Test Case 1:**  All the pairs (i,j)=(1,2),(2,3)(i, j) = (1, 2), (2, 3)(i,j)=(1,2),(2,3) and (1,3)(1, 3)(1,3) are valid.

**Test Case 2:** There are no valid pairs.
