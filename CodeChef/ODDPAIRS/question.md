# Odd Pairs Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-05-28 |

---

## Problem Statement

### Odd Pairs

Given an integer NNN, determine the number of pairs (A,B)(A, B)(A,B) such that:

- 1≤A,B≤N1 \leq A, B \leq N1≤A,B≤N;

- A+BA + BA+B is **odd**.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of a single integer NNN.

### Output Format

For each test case, output the number of required pairs.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤N≤1091 \leq N \leq 10^91≤N≤109

### Sample 1:

Input

Output

```
5
1
2
3
100
199

```

```
0
2
4
5000
19800

```

### Explanation:

**Test case 111:** There are no pairs satisfying the given conditions.

**Test case 222:** The pairs satisfying both conditions are: (1,2)(1, 2)(1,2) and (2,1)(2, 1)(2,1).

**Test case 333:** The pairs satisfying both conditions are: (1,2),(2,1),(2,3),(1, 2), (2, 1), (2, 3),(1,2),(2,1),(2,3), and (3,2)(3, 2)(3,2).
