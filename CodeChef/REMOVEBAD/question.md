# Remove Bad elements Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-19 |

---

## Problem Statement

### Remove Bad elements

Chef has an array AAA of length NNN.

In one operation, Chef can remove **any one** element from the array.

Determine the **minimum** number of operations required to make all the elements **same**.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of multiple lines of input.

The first line of each test case contains a single integer NNN —the length of Array AAA.

- Next line contains NNN space-separated integers A1,A2,A3,…,ANA_1, A_2, A_3, \dots, A_NA1​,A2​,A3​,…,AN​ - denoting the array AAA.

### Output Format

For each test case, output the **minimum** number of operations required to make all the elements same.

### Constraints

- 1≤T≤40001 \leq T \leq 40001≤T≤4000

- 1≤N≤1051 \leq N \leq 10^51≤N≤105

- 1≤Ai≤N1 \leq A_i \leq N1≤Ai​≤N

- Sum of NNN over all test cases do not exceed 3⋅1053 \cdot 10^53⋅105

### Sample 1:

Input

Output

```
4
3
3 3 3
6
1 3 2 1 2 2
4
1 2 1 2
5
1 3 2 4 5

```

```
0
3
2
4

```

### Explanation:

**Test case 111:** All the elements are already same. Thus we need to perform zero operations.

**Test case 222:** We remove the elements A1,A2,A_1, A_2,A1​,A2​, and A4A_4A4​ using three operations. The array becomes [2,2,2][2, 2, 2][2,2,2] where all elements are same.

**Test case 333:** We remove the elements A1A_1A1​ and A3A_3A3​ using two operations. The array becomes [2,2][2, 2][2,2] where all elements are same.

**Test case 444:** We remove the elements A1,A2,A3,A_1, A_2, A_3,A1​,A2​,A3​, and A4A_4A4​ using four operations. The array becomes [5][5][5].
