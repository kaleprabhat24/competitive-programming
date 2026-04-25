# Binary Substituition Practice Problem in Dynamic programming

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-04-25 |

---

## Problem Statement

### Binary Substituition

Chef has a binary string SSS. He can replace any occurrence of -

- 010101 with aaa

- 101010 with bbb

- 010010010 with ababab

- 101101101 with bababa

While doing these operations, Chef noticed that he can end up with different strings depending upon the order of application of the operations. Given the final string containing only aaa and bbb, Chef wants to know the number of possible strings he might have began with.

As the number of initial strings can be large, print the result modulo 998244353998244353998244353.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of a single line of input denoting SSS, the final string obtained after applying the operations.

### Output Format

For each test case, output the number of original strings that can result in the final string mod 998244353998244353998244353.

### Constraints

- 1≤T≤5⋅1041 \leq T \leq 5\cdot 10^41≤T≤5⋅104

- 1≤∣S∣≤1051 \leq |S| \leq 10^51≤∣S∣≤105

- The sum of ∣S∣|S|∣S∣ over all test cases won't exceed 5⋅1055\cdot 10^55⋅105.

- SSS consists of aaa and bbb only.

### Sample 1:

Input

Output

```
3
ab
aa
abb

```

```
2
1
2

```

### Explanation:

**Test case 111:** The binary strings that can result in the string ababab are 011001100110 and 010010010.

- 011001100110: Replace the first two characters 010101 with aaa and last two characters 101010 with bbb. Thus, we get ababab.

- 010010010: Replace the characters 010010010 with ababab.

**Test case 222:** The only binary string that can result in the string aaaaaa is 010101010101. In 010101010101, we replace the first two characters with aaa and last two characters with aaa as well.

**Test case 333:** The binary strings that can result in the string abbabbabb are 011010011010011010 and 010100101001010.

- 011010011010011010: Replace the first two characters 010101 with aaa, next two characters 101010 with bbb, and last two characters 101010 with bbb. Thus, we get abbabbabb.

- 010100101001010: Replace the characters 010010010 with ababab and the characters 101010 with bbb.
