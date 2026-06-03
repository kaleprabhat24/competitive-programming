# Counting Problem Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-03 |

---

## Problem Statement

### Counting Problem

You are given an array A=[A1,A2,…,AN]A = [A_1, A_2, \ldots, A_N]A=[A1​,A2​,…,AN​].

Is it possible to partition AAA into two non-empty subsequences S1S_1S1​ and S2S_2S2​ such that sum(S1)×sum(S2)sum(S_1) \times sum(S_2)sum(S1​)×sum(S2​) is **odd**?

Here, sum(S1)sum(S_1)sum(S1​) denotes the sum of elements in S1S_1S1​, and sum(S2)sum(S_2)sum(S2​) is defined similarly.

**Note:** S1S_1S1​ and S2S_2S2​ must *partition* AAA, that is:

- S1S_1S1​ and S2S_2S2​ must be non-empty

- Every element of AAA must be in either S1S_1S1​ or S2S_2S2​

- S1S_1S1​ and S2S_2S2​ must be disjoint (in terms of which indices their subsequences represent)

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of 2 lines of input.

The first line of each test case contains a single integer NNN, the size of the array.

- The next line contains NNN space-separated integers A1,A2,…,ANA_1, A_2, \ldots, A_NA1​,A2​,…,AN​: the elements of the array.

### Output Format

For each test case, print on a new line the answer: `YES` if the array can be partitioned into two subsequences satisfying the condition, and `NO` otherwise.

Each character of the output may be printed in either uppercase or lowercase, i.e, `YES`, `yes`, `YEs`, and `yEs` will all be treated as equivalent.

### Constraints

- 1≤T≤1051 \leq T \leq 10^51≤T≤105

- 2≤N≤1052 \leq N \leq 10^52≤N≤105

- 1≤Ai≤1091 \leq A_i \leq 10^91≤Ai​≤109

- The sum of NNN across all test cases won't exceed 10610^6106.

### Sample 1:

Input

Output

```
4
4
1 1 2 2
6
1 2 4 6 8 10
2
3 5
3
1 3 5
```

```
YES
NO
YES
NO
```

### Explanation:

**Test case 111:** We have A=[1‾,1,2‾,2]A = [\underline{1}, 1, \underline{2}, 2]A=[1​,1,2​,2]. Let S1S_1S1​ be the underlined elements and S2S_2S2​ be the other ones. sum(S1)×sum(S2)=3×3=9sum(S_1) \times sum(S_2) = 3\times 3 = 9sum(S1​)×sum(S2​)=3×3=9.

**Test case 222:** It can be proved that no partition of AAA into S1,S2S_1, S_2S1​,S2​ satisfies the condition.

**Test case 444:** Choose S1={3},S2={5}S_1 = \{3\}, S_2 = \{5\}S1​={3},S2​={5}.

**Test case 444:** It can be proved that no partition of AAA into S1,S2S_1, S_2S1​,S2​ satisfies the condition.
