# Prime Reversal Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-05-31 |

---

## Problem Statement

### Prime Reversal

You are given two **binary** strings AAA and BBB, each of length NNN. You can perform the following operation on string AAA any number of times:

- Select a prime number XXX.

- Choose any substring of string AAA having length XXX and **reverse** the substring.

Determine whether you can make the string AAA equal to BBB using any (possibly zero) number of operations.

A substring is obtained by deleting some (possibly zero) elements from the beginning and some (possibly zero) elements from the end of the string.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of multiple lines of input.

The first line of each test case contains an integer NNN — the length of the strings AAA and BBB.

- The second line contains the binary string AAA.

- The third line contains the binary string BBB.

### Output Format

For each test case, output on a new line, `YES`, if you can make the string AAA equal to BBB using any number of operations and `NO` otherwise.

You can print each character in uppercase or lowercase. For example, `YES`, `yes`, `Yes`, and `yES` are all identical.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤N≤1051 \leq N \leq 10^51≤N≤105

- AiA_iAi​ and BiB_iBi​ contain 000 and 111 only.

- The sum of NNN over all test cases won't exceed 10510^5105.

### Sample 1:

Input

Output

```
4
2
00
00
4
1001
0111
5
11000
10010
5
11000
11010

```

```
YES
NO
YES
NO

```

### Explanation:

**Test case 111:** Both the strings are equal. Thus, we do not need any operations.

**Test case 222:** It can be shown that we cannot make the string AAA equal to BBB using any number of operations.

**Test case 333:** Choose X=3X = 3X=3 and reverse the substring A[2,4]=100A[2,4] = 100A[2,4]=100. Thus, the string AAA becomes 100101001010010 which is equal to BBB.

**Test case 444:** It can be shown that we cannot make the string AAA equal to BBB using any number of operations.
