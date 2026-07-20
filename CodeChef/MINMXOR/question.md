# Minimum XOR Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-07-20 |

---

## Problem Statement

### Minimum XOR

You have NNN integers - A1,A2,…,ANA_1, A_2, \ldots, A_NA1​,A2​,…,AN​.

You have to make the Bitwise XOR of all the elements as minimum as possible.

You are allowed to remove at most one element. Note that this means that you can also choose to not remove any element.

What is the final minimum XOR that you can achieve after removing at most one element?

**Note:** In most programming languages, the XOR of two variables x and y can be computed using x ^ y.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of two lines of input.

The first line of each test case contains an integer NNN — the number of elements.

- The next line contains NNN space separated integers

### Output Format

For each test case, output on a new line the final minimum XOR of the elements.

### Constraints

- 1≤T≤1051 \leq T \leq 10^51≤T≤105

- 1≤N≤3⋅1051 \leq N \leq 3 \cdot 10^51≤N≤3⋅105

- 1≤Ai≤1051 \leq A_i \leq 10^51≤Ai​≤105

- Sum of NNN over all the testcases ≤3⋅105\leq 3\cdot10^5≤3⋅105

### Sample 1:

Input

Output

```
3
4
2 4 3 6
2
4 4
5
1 3 5 17 9
```

```
0
0
14
```

### Explanation:

**Testcase 1:** The bitwise XOR of all elements {2,4,3,6}\{2, 4, 3, 6\}{2,4,3,6} is 333. If we remove the element 333, the total XOR of the remaining elements becomes 000 which is minimum possible XOR.

**Testcase 2:** The bitwise XOR of all elements {4,4}\{4, 4\}{4,4} is 000. This is already the minimum possible total XOR, and so we will not remove any element.

**Testcase 3:** The bitwise XOR of all elements {1,3,5,17,9}\{1, 3, 5, 17, 9\}{1,3,5,17,9} is 313131. If we remove the element 171717, the total XOR of the remaining elements becomes 141414 which is minimum possible XOR.
