# Practice Coding Problem

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-04-01 |

---

## Problem Statement

### Set Size

You are given an array AAA of NNN integers - [A1,A2,…,AN][A_1, A_2, \ldots, A_N][A1​,A2​,…,AN​].

For a positive integer XXX, consider the set SXS_XSX​ defined as {Ai+j\{A_i + j{Ai​+j ∣|∣ 1≤i≤N,1≤j≤X}1 \le i \le N, 1 \le j \le X\}1≤i≤N,1≤j≤X}, i.e. the elements added in this set will be {A1+1,A1+2,…,A1+X,A2+1,A2+2,…,A2+X,…,AN+1,AN+2,…,AN+X}\{A_1 + 1, A_1 + 2, \ldots, A_1 + X, A_2 + 1, A_2 + 2, \ldots, A_2 + X, \ldots, A_N + 1, A_N + 2, \ldots, A_N + X\}{A1​+1,A1​+2,…,A1​+X,A2​+1,A2​+2,…,A2​+X,…,AN​+1,AN​+2,…,AN​+X}.

Then, we are interested in the value ∣SX∣|S_X|∣SX​∣, i.e. the number of distinct elements in this set.

You need to answer QQQ queries : given an integer XXX, find ∣SX∣|S_X|∣SX​∣.

### Input Format

- The first line contains 222 integers NNN and QQQ - the size of the array, and the number of queries.

- The second line contains NNN integers - A1,A2,…,ANA_1, A_2, \ldots, A_NA1​,A2​,…,AN​.

- The next QQQ lines contain one integer each - XXX, representing a query.

### Output Format

For each query, output ∣SX∣|S_X|∣SX​∣.

### Constraints

- 1≤N,Q≤3⋅1051 \le N, Q \le 3 \cdot 10^51≤N,Q≤3⋅105

- 1≤Ai≤1091 \le A_i \le 10^91≤Ai​≤109

- 1≤X≤1091 \le X \le 10^91≤X≤109

### Sample 1:

Input

Output

```
4 5
8 8 1 6
1
2
3
10
1000000000

```

```
3
6
8
17
1000000007
```

### Explanation:

**Query 1** : The set SXS_XSX​ is {2,7,9}\{2, 7, 9\}{2,7,9}.

**Query 2** : The set SXS_XSX​ is {2,3,7,8,9,10}\{2, 3, 7, 8, 9, 10\}{2,3,7,8,9,10}.

### Sample 2:

Input

Output

```
5 2
10 20 30 40 50
5
12

```

```
25
52
```
