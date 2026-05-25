# Even

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-05-25 |

---

## Problem Statement

### Even-tual Reduction

### Read problems statements in Hindi, Mandarin Chinese, Russian, Vietnamese, and Bengali as well.

You are given a string SSS with length NNN. You may perform the following operation any number of times: choose a non-empty substring of SSS (possibly the whole string SSS) such that each character occurs an even number of times **in this substring** and erase this substring from SSS. (The parts of SSS before and after the erased substring are concatenated and the next operation is performed on this shorter string.)

For example, from the string "ac**abba**d", we can erase the highlighted substring "abba", since each character occurs an even number of times in this substring. After this operation, the remaining string is "acd".

Is it possible to erase the whole string using one or more operations?

Note: A string BBB is a substring of a string AAA if BBB can be obtained from AAA by deleting several (possibly none or all) characters from the beginning and several (possibly none or all) characters from the end.

### Input

- The first line of the input contains a single integer TTT denoting the number of test cases. The description of TTT test cases follows.

- The first line of each test case contains a single integer NNN.

- The second line contains a single string SSS with length NNN.

### Output

For each test case, print a single line containing the string `"YES"` if it is possible to erase the whole string or `"NO"` otherwise (without quotes).

### Constraints

- 1≤T≤2001 \le T \le 2001≤T≤200

- 1≤N≤1,0001 \le N \le 1,0001≤N≤1,000

- SSS contains only lowercase English letters

### Sample 1:

Input

Output

```
4
6
cabbac
7
acabbad
18
fbedfcbdaebaaceeba
21
yourcrushlovesyouback
```

```
YES
NO
YES
NO
```

### Explanation:

**Example case 1:** We can perform two operations: erase the substring "abba", which leaves us with the string "cc", and then erase "cc".
