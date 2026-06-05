# Pseudo Sorted Array Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-05 |

---

## Problem Statement

### Pseudo Sorted Array

An array AAA of length NNN is said to be *pseudo-sorted* if it can be made non-decreasing after performing the following operation **at most once**.

- Choose an iii such that 1≤i≤N−11 \le i \leq N-11≤i≤N−1 and swap AiA_iAi​ and Ai+1A_{i+1}Ai+1​

Given an array AAA, determine if it is *pseudo-sorted* or not.

### Input Format

- The first line contains a single integer TTT - the number of test cases. Then the test cases follow.

- The first line of each test case contains an integer NNN - the size of the array AAA.

- The second line of each test case contains NNN space-separated integers A1,A2,…,ANA_1, A_2, \dots, A_NA1​,A2​,…,AN​ denoting the array AAA.

### Output Format

For each testcase, output `YES` if the array AAA is pseudo-sorted, `NO` otherwise.

You may print each character of `YES` and `NO` in uppercase or lowercase (for example, `yes`, `yEs`, `Yes` will be considered identical).

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 2≤N≤1052 \leq N \leq 10^52≤N≤105

- 1≤Ai≤1091 \leq A_i \leq 10^91≤Ai​≤109

- Sum of NNN over all test cases do not exceed 2⋅1052 \cdot 10^52⋅105

### Sample 1:

Input

Output

```
3
5
3 5 7 8 9
4
1 3 2 3
3
3 2 1

```

```
YES
YES
NO

```

### Explanation:

**Test case 1:** The array is already sorted in non-decreasing order.

**Test case 2:** We can choose i=2i = 2i=2 and swap A2A_2A2​ and A3A_3A3​. The resulting array will be [1,2,3,3][1, 2, 3, 3][1,2,3,3], which is sorted in non-decreasing order.

**Test case 3:** It can be proven that the array cannot be sorted in non-decreasing order in at most one operation.
