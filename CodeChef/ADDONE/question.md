# Add One Practice Problem in Strings

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-03-27 |

---

## Problem Statement

### Add One

You are given a large number NNN. You need to print the number N+1N+1N+1.

Note: The number is very large and it will not fit in standard integer data type. You have to take the input as String and then manipulate the digits to convert it to N+1N + 1N+1.

### Input Format

- 

The first line of the input contains a single integer TTT - the number of test cases. The description of TTT test cases follows.

- 

The first line of each test case contains a single integer NNN.

### Output Format

- For each test case, print a single line string - the number N+1N+1N+1.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤N≤10200000−11 \leq N \leq 10^{200000}-11≤N≤10200000−1

- the sum of the number of digits of all NNN in a single test file does not exceed 4⋅1054 \cdot 10^{5}4⋅105

### Subtasks

**Subtask #1 (30 points):**

- each digit of the number NNN is at most 888

**Subtask #2 (70 points):** original constraints

### Sample 1:

Input

Output

```
6
99
17
1
599
10000000000000000000
549843954323494990404
```

```
100
18
2
600
10000000000000000001
549843954323494990405
```

### Explanation:

**Example case 1:** N=99N=99N=99 so N+1=100N+1=100N+1=100.

**Example case 2:** N=17N=17N=17 so N+1=18N+1=18N+1=18.

**Example case 3:** N=1N=1N=1 so N+1=2N+1=2N+1=2.

**Example case 4:** N=599N=599N=599 so N+1=600N+1=600N+1=600.

**Example case 5:** N=10000000000000000000N=10000000000000000000N=10000000000000000000 so N+1=10000000000000000001N+1=10000000000000000001N+1=10000000000000000001.

**Example case 6:** N=549843954323494990404N=549843954323494990404N=549843954323494990404 so N+1=549843954323494990405N+1=549843954323494990405N+1=549843954323494990405.
