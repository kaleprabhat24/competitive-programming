# Sort the String Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-28 |

---

## Problem Statement

### Sort the String

You have a **binary** string SSS of length NNN. In one operation you can select a substring of SSS and **reverse** it. For example, on reversing the substring S[2,4]S[2,4]S[2,4] for S=11000S=11000S=11000, we change 11000→100101 \textcolor{red}{100} 0 \rightarrow 1 \textcolor{red}{001} 011000→10010.

Find the **minimum** number of operations required to sort this binary string.

It can be proven that the string can always be sorted using the above operation finite number of times.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of 222 lines of input.

The first line of each test case contains a single integer NNN — the length of the binary string.

- The second line of each test case contains a binary string SSS of length NNN.

### Output Format

For each test case, output on a new line — the minimum number of operations required to sort the binary string.

### Constraints

- 1≤T≤2⋅1051 \leq T \leq 2\cdot 10^51≤T≤2⋅105

- 1≤N≤2⋅1051 \leq N \leq 2\cdot 10^51≤N≤2⋅105

- Sum of NNN over all test cases does not exceed 10610^6106.

- String SSS consists of only '000's and '111's.

### Sample 1:

Input

Output

```
4
3
000
4
1001
4
1010
6
010101
```

```
0
1
2
2
```

### Explanation:

**Test case 111:** The string is already sorted, hence, zero operations are required to sort it.

**Test case 222:** We can sort the string in the following way:  1001\textcolor{red}{100} 11001 →\rightarrow→ 001100110011.

**Test case 333:** We can sort the string in the following way:

10101 \textcolor{red}{01} 01010 →\rightarrow→ 1100\textcolor{red}{1100}1100 →\rightarrow→ 001100110011.

It can be proven that this string cannot be sorted in less than 222 operations.

**Test case 444:** We can sort the string in the following way:

0101010 \textcolor{red}{1010}1010101 →\rightarrow→ 00101100 \textcolor{red}{10}11001011 →\rightarrow→ 000111000111000111.

It can be proven that this string cannot be sorted in less than 222 operations.
