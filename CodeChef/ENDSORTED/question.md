# End Sorted Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-05-30 |

---

## Problem Statement

### End Sorted

Chef considers a permutation PPP of {1,2,3,…,N}\{1, 2, 3, \dots, N\}{1,2,3,…,N} `End Sorted` if and only if P1=1P_1 = 1P1​=1 and PN=NP_N = NPN​=N.

Chef is given a permutation PPP.

In one operation Chef can choose any index i (1≤i≤N−1)i \ (1 \leq i \leq N-1)i (1≤i≤N−1) and swap PiP_iPi​ and Pi+1P_{i+1}Pi+1​. Determine the minimum number of operations required by Chef to make the permutation PPP `End Sorted`.

**Note:** An array PPP is said to be a permutation of {1,2,3,…,N}\{1, 2, 3, \dots, N\}{1,2,3,…,N} if PPP contains each element of {1,2,3,…,N}\{1, 2, 3, \dots, N\}{1,2,3,…,N} exactly once.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of two lines of input.

The first line of each test case contains a single integer NNN, denoting the length of the permutation PPP.

- The second line contains NNN space-separated integers P1,P2,P3,…,PNP_1, P_2, P_3, \ldots, P_NP1​,P2​,P3​,…,PN​, denoting the permutation PPP.

### Output Format

For each test case, output minimum number of operations required by Chef to make the permutation PPP `End Sorted`.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 2≤N≤1052 \leq N \leq 10^52≤N≤105

- PPP is a permutation of {1,2,3,…N}\{1, 2, 3, \dots N\}{1,2,3,…N}

- The sum of NNN over all test cases does not exceed 3⋅1053 \cdot 10^53⋅105.

### Sample 1:

Input

Output

```
4
4
1 3 2 4
3
3 2 1
2
2 1
3
2 1 3

```

```
0
3
1
1

```

### Explanation:

**Test case 111:** PPP is already `End Sorted`.

**Test case 222:** PPP can be made `End Sorted` using 333 operations as follows: [3,2,1]→[2,3,1]→[2,1,3]→[1,2,3][3, 2, 1] \to [\textcolor{red}{2, 3}, 1] \to [2, \textcolor{red}{1, 3}] \to [\textcolor{red}{1, 2}, 3][3,2,1]→[2,3,1]→[2,1,3]→[1,2,3]. It can be shown that achieving this in fewer than 333 moves is impossible.

**Test case 333:** PPP can be made `End Sorted` using one operation, by swapping 111 and 222.

**Test case 444:** PPP can be made `End Sorted` using one operation, by swapping 111 and 222.
