# Alternating String Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-30 |

---

## Problem Statement

### Alternating String

A binary string is called *alternating* if no two adjacent characters of the string are equal. Formally, a binary string TTT of length MMM is called alternating if Ti≠Ti+1T_i \neq T_{i +1}Ti​=Ti+1​ for each 1≤i<M1 \leq i \lt M1≤i<M.

For example, `0`, `1`, `01`, `10`, `101`, `010`, `1010` are alternating strings while `11`, `001`, `1110` are not.

You are given a binary string SSS of length NNN. You would like to rearrange the characters of SSS such that the length of the **longest alternating substring** of SSS is **maximum**. Find this maximum value.

A binary string is a string that consists of characters `0` and `1`. A string aaa is a substring of a string bbb if aaa can be obtained from bbb by deletion of several (possibly, zero or all) characters from the beginning and several (possibly, zero or all) characters from the end.

### Input Format

- The first line of input contains an integer TTT, denoting the number of test cases. The TTT test cases then follow:

- The first line of each test case contains an integer NNN.

- The second line of each test case contains the binary string SSS.

### Output Format

For each test case, output the maximum possible length of the longest alternating substring of SSS after rearrangement.

### Constraints

- 1≤T≤1041 \leq T \leq 10^41≤T≤104

- 1≤N≤1051 \leq N \leq 10^51≤N≤105

- SSS contains only the characters `0` and `1`.

- Sum of NNN over all test cases does not exceed 2⋅1052 \cdot 10^52⋅105.

### Sample 1:

Input

Output

```
4
3
110
4
1010
4
0000
7
1101101

```

```
3
4
1
5

```

### Explanation:

**Test case 111:** Swapping the second and third characters makes S=101S=101S=101. Hence the length of the longest alternating substring is 333 (choosing the entire string as a substring).

**Test case 222:** The given string S=1010S=1010S=1010 is an alternating string of length 444.

**Test case 333:** The length of the longest alternating substring is 111 for any rearrangement of  S=0000S=0000S=0000.

**Test case 444:** One possible rearrangement of SSS is 110101‾11\underline{10101}1110101​1, which has an alternating substring of length 555 (the substring starting at index 222 and ending at index 666).
