# Zero String Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-05-26 |

---

## Problem Statement

### Zero String

You are given a binary string SSS of length NNN. You are allowed to perform the following types of operations on string SSS:

- Delete any **one** character from SSS, and concatenate the remaining parts of the string. For example, if we delete the third character of S=1101S = 1101S=1101, it becomes S=111S = 111S=111.

- Flip all the characters of SSS. For example, if we flip all character of S=1101S = 1101S=1101, it becomes S=0010S = 0010S=0010.

Given that you can use either type of operation any number of times, find the **minimum** number of operations required to make all characters of the string SSS equal to 000.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of multiple lines of input.

The first line of each test case contains an integer NNN — the length of the string.

- The next line contains a binary string SSS of length NNN.

### Output Format

For each test case, output on a new line, the **minimum** number of operations required to make all characters of the string SSS equal to 000.

### Constraints

- 1≤T≤20001 \leq T \leq 20001≤T≤2000

- 1≤N≤1051 \leq N \leq 10^51≤N≤105

- SSS contains 000 and 111 only.

- The sum of NNN over all test cases won't exceed 2⋅1052\cdot 10^52⋅105.

### Sample 1:

Input

Output

```
4
2
01
3
101
3
111
4
0000

```

```
1
2
1
0

```

### Explanation:

**Test case 111:** You can use one operation to delete the second character of the string SSS. Thus, the string becomes 000. Note that all characters of this string are 000 and thus, it satisfies the conditions.

**Test case 222:** You can perform the following operations:

- Operation 111: Flip all characters of the string. Thus, string becomes 010010010.

- Operation 222: Delete the second character of the string. Thus, string becomes 000000.

Note that we have obtained a string having all characters as 000 in two operations. It can be shown that this is the minimum number of operations required.

**Test case 333:** You can use one operation to flip all characters of the string SSS. Thus, the string becomes 000000000. Note that all characters of this string are 000 and thus, it satisfies the conditions.

**Test case 444:** The existing string satisfies the conditions. Thus, we require zero operations.
