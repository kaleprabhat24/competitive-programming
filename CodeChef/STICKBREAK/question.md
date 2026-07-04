# Stick Break Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-07-04 |

---

## Problem Statement

### Stick Break

Chef has a stick of length LLL. Chef wants to break the stick into KKK parts such that each part has a non-zero length.

Let the lengths of the KKK parts be A1,A2,…,AKA_1, A_2, \ldots, A_KA1​,A2​,…,AK​ (Note that A1+A2+…+AK=LA_1 + A_2 + \ldots + A_K = LA1​+A2​+…+AK​=L and AiA_iAi​ is a **positive integer** for all iii). Chef wants to minimize the value of ∑i=1K−1∣Ai+1−Ai∣\displaystyle \sum_{i = 1}^{K - 1}|A_{i + 1} - A_i|i=1∑K−1​∣Ai+1​−Ai​∣. Can you help Chef? (Here ∣x∣|x|∣x∣ denotes the absolute value of xxx)

Under the given constraints it will always be possible to break the stick into KKK parts of non-zero lengths.

### Input Format

- The first line contains a single integer TTT — the number of test cases. Then the test cases follow.

- The first and only line of each test case contains two space-separated integers LLL and KKK — the initial length of the stick and the number of parts Chef wants to break the stick into.

### Output Format

For each test case, output the minimum value of ∑i=1K−1∣Ai+1−Ai∣\displaystyle \sum_{i = 1}^{K - 1}|A_{i + 1} - A_i|i=1∑K−1​∣Ai+1​−Ai​∣.

### Constraints

- 1≤T≤1041 \leq T \leq 10^41≤T≤104

- 2≤K≤L≤1092 \le K \le L \le 10^92≤K≤L≤109

### Sample 1:

Input

Output

```
2
4 3
2 2

```

```
1
0

```

### Explanation:

**Test Case 1:** It is optimal to break the stick of length 444 into 333 parts in the following manner: [2,1,1][2, 1, 1][2,1,1]. The value of ∑i=1K−1∣Ai+1−Ai∣=∣1−2∣+∣1−1∣=1\displaystyle \sum_{i = 1}^{K - 1}|A_{i + 1} - A_i| = |1 - 2| + |1 - 1| = 1i=1∑K−1​∣Ai+1​−Ai​∣=∣1−2∣+∣1−1∣=1.

**Test Case 2:** It is optimal to break the stick of length 222 into 222 parts in the following manner: [1,1][1, 1][1,1]. The value of ∑i=1K−1∣Ai+1−Ai∣=∣1−1∣=0\displaystyle \sum_{i = 1}^{K - 1}|A_{i + 1} - A_i| = |1 - 1| = 0i=1∑K−1​∣Ai+1​−Ai​∣=∣1−1∣=0.
