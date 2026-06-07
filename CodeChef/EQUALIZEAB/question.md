# Equalize AB Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-07 |

---

## Problem Statement

### Equalize AB

You are given two numbers AAA and BBB along with an integer XXX. In one operation you can do one of the following:

- Set A=A+XA = A + XA=A+X and B=B−XB = B - XB=B−X

- Set A=A−XA = A - XA=A−X and B=B+XB = B + XB=B+X

Determine if you can make AAA and BBB equal after applying the operation any number of times (possibly zero).

### Input Format

- The first line contains a single integer TTT — the number of test cases. Then the test cases follow.

- The first and only line of each test case contains two space-separated integers A,BA, BA,B and XXX — the parameters mentioned in the statement.

### Output Format

For each test case, output `YES` if you can make AAA and BBB equal after applying the operation any number of times (possibly zero). Otherwise, output `NO`.

You can output each letter in any case i.e. `YES`, `yes`, `yEs` are all considered the same.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤A,B,X≤1091 \leq A, B, X \leq 10^91≤A,B,X≤109

### Sample 1:

Input

Output

```
4
5 7 1
3 4 2
4 4 6
2 5 3

```

```
YES
NO
YES
NO

```

### Explanation:

**Test Case 1:** The initial values of (A,B)(A, B)(A,B) is (5,7)(5, 7)(5,7). We can perform the following operation: (5,7)→A=A+X,B=B−X(6,6)(5,7) \xrightarrow{A = A + X, B = B - X} (6,6)(5,7)A=A+X,B=B−X

​(6,6).

**Test Case 2:** It can be proven that we can not make AAA equal to BBB using the given operations.

**Test Case 3:** AAA and BBB are already equal.
