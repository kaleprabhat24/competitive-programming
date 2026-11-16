# Make Multiple Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-16 |

---

## Problem Statement

### Make Multiple

Chef has two integers AAA and BBB (A≤B)(A \leq B)(A≤B).

Chef can choose any **non-negative** integer XXX and add them to both AAA and BBB. Find whether it is possible to make AAA a divisor of BBB.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of two integers AAA and BBB.

### Output Format

For each test case, output `YES` if it is possible to make AAA a factor of BBB, `NO` otherwise.

You can print each character of the string in uppercase or lowercase. For example, the strings `Yes`, `YES`, `yes`, and `yEs`, are all considered identical.

### Constraints

- 1≤T≤1051 \leq T \leq 10^51≤T≤105

- 1≤A≤B≤1091 \leq A \leq B \leq 10^91≤A≤B≤109

### Sample 1:

Input

Output

```
3
3 6
4 14
9 10

```

```
YES
YES
NO

```

### Explanation:

**Test case 111:** We can choose X=0X = 0X=0 and add them to 333 and 666. Thus, 333 is a factor of 666.

**Test case 222:** We can choose X=1X = 1X=1 and add them to 444 and 141414. Thus, 4+1=54+1 = 54+1=5 is a factor of 14+1=1514+1 = 1514+1=15.

**Test case 333:** There is no possible value of XXX to add such that AAA becomes a factor of BBB.
