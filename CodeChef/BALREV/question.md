# Balanced Reversals Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-17 |

---

## Problem Statement

### Balanced Reversals

Chef is given a binary string AAA of length NNN. He can perform the following operation on AAA any number of times:

- Choose LLL and RRR (1≤L≤R≤N)(1 \leq L \leq R \leq N)(1≤L≤R≤N), such that, in the substring A[L,R]A[L,R]A[L,R], the number of 111s is **equal** to the number of 000s and **reverse** the substring A[L,R]A[L,R]A[L,R].

Find the lexicographically **smallest** string that Chef can obtain after performing the above operation **any** (possibly zero) number of times on AAA.

String XXX is lexicographically smaller than string YYY, if either of the following satisfies:

- XXX is a prefix of YYY and X≠YX \neq YX=Y.

- There exists an index iii such that Xi<YiX_i \lt Y_iXi​<Yi​ and Xj=Yj,∀jX_j = Y_j, \forall jXj​=Yj​,∀j such that 1≤j<i1 \leq j \lt i1≤j<i.

### Input Format

- First line will contain TTT, the number of test cases. Then the test cases follow. Each test case contains two lines.

- The first line contains the integer NNN, the length of the binary string.

- The second line contains the binary string AAA.

### Output Format

For each test case, print the lexicographically **smallest** binary string that can be obtained after performing the operation **any** (possibly zero) number of times.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤N≤1051 \leq N \leq 10^51≤N≤105

- Sum of NNN over all test cases does not exceed 2⋅1052 \cdot 10^52⋅105.

### Sample 1:

Input

Output

```
2
5
01100
4
0000

```

```
00011
0000
```

### Explanation:

**Test Case 111:** Chef can choose L=2L = 2L=2 and R=5R=5R=5. The chosen substring, A[2,5]=1100A[2,5] = 1100A[2,5]=1100. On reversing this, we get 001100110011. Thus, the final string is A=00011A = 00011A=00011.  Note that this is the lexicographically smallest string possible.

**Test Case 222:** Since the string is already lexicographically minimum, Chef does not need to apply any operation.
