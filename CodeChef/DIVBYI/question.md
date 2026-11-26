# Divisible by i Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-26 |

---

## Problem Statement

### Divisible by i 

You are given an integer NNN.

Construct a permutation PPP of length NNN such that

- For all iii (1≤i≤N−1)(1 \leq i \leq N-1)(1≤i≤N−1), iii divides abs(Pi+1−Pi)abs(P_{i+1}-P_i)abs(Pi+1​−Pi​).

Recall that a permutation of length NNN is an array where every integer from 111 to NNN occurs exactly once.

It can be proven that for the given constraints at least one such PPP always exists.

### Input Format

- The first line of input contains a single integer TTT, denoting the number of test cases. The description of TTT test cases follow.

- The only line of each test case contains an integer NNN - the length of the array to be constructed.

### Output Format

For each test case, output a single line containing NNN space-separated integers P1,P2,…,PNP_1, P_2, \dots, P_NP1​,P2​,…,PN​, denoting the elements of the array PPP.

If there exist multiple such arrays, print any.

### Constraints

- 1≤T≤5⋅1041 \leq T \leq 5 \cdot 10^41≤T≤5⋅104

- 2≤N≤1052 \leq N \leq 10^52≤N≤105

- The sum of NNN over all test cases does not exceed 10510^5105.

### Sample 1:

Input

Output

```
2
2
3

```

```
1 2
2 1 3

```

### Explanation:

**Test case 1:** A possible array satisfying all the conditions is [1,2][1, 2][1,2]:

- For i=1i=1i=1: abs(A2−A1)=abs(2−1)=1abs(A_2-A_1)=abs(2-1)=1abs(A2​−A1​)=abs(2−1)=1 is divisible by 111.

**Test case 2:** A possible array satisfying all the conditions is [2,1,3][2, 1, 3][2,1,3]:

- For i=1i=1i=1: abs(A2−A1)=abs(1−2)=1abs(A_2-A_1)=abs(1-2)=1abs(A2​−A1​)=abs(1−2)=1 is divisible by 111.

- For i=2i=2i=2: abs(A3−A2)=abs(3−1)=2abs(A_3-A_2)=abs(3-1)=2abs(A3​−A2​)=abs(3−1)=2 is divisible by 222.
