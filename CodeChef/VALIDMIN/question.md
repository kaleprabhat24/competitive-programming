# Valid Minimum Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-07-09 |

---

## Problem Statement

### Valid Minimum

There are 333 hidden numbers A,B,CA, B, CA,B,C.

You somehow found out the values of min⁡(A,B),min⁡(B,C),\min(A, B), \min(B, C),min(A,B),min(B,C), and min⁡(C,A)\min(C, A)min(C,A).

Determine whether there exists any tuple (A,B,C)(A, B, C)(A,B,C) that satisfies the given values of min⁡(A,B),min⁡(B,C),min⁡(C,A)\min(A, B), \min(B, C), \min(C, A)min(A,B),min(B,C),min(C,A).

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- The first and only line of each test case contains 333 space-separated integers denoting the values of min⁡(A,B),min⁡(B,C),\min(A, B), \min(B, C),min(A,B),min(B,C), and min⁡(C,A)\min(C, A)min(C,A).

### Output Format

For each test case, output `YES` if there exists any valid tuple (A,B,C)(A, B, C)(A,B,C), and `NO` otherwise.

You can print each letter of the output in any case. For example `YES`, `yes`, `yEs` will all be considered equivalent.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤min(A,B),min(B,C),min(C,A)≤101 \leq min(A, B), min(B, C), min(C, A) \leq 101≤min(A,B),min(B,C),min(C,A)≤10

### Sample 1:

Input

Output

```
3
5 5 5
2 3 4
2 2 4

```

```
YES
NO
YES

```

### Explanation:

**Test case 111:** One valid tuple (A,B,C)(A, B, C)(A,B,C) is (5,5,5)(5, 5, 5)(5,5,5).

**Test case 222:** It can be shown that there is no valid tuple (A,B,C)(A, B, C)(A,B,C).

**Test case 333:** One valid tuple (A,B,C)(A, B, C)(A,B,C) is (4,2,5)(4, 2, 5)(4,2,5).
