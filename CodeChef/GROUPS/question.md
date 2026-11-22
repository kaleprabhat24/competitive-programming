# Chef and Groups Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-22 |

---

## Problem Statement

### Chef and Groups

There are NNN seats in a row. You are given a string SSS with length NNN; for each valid iii, the iii-th character of SSS is '0' if the iii-th seat is empty or '1' if there is someone sitting in that seat.

Two people are friends if they are sitting next to each other. Two friends are always part of the same group of friends. Can you find the total number of groups?

### Input

- The first line of the input contains a single integer TTT denoting the number of test cases. The description of TTT test cases follows.

- The first and only line of each test case contains a single string SSS.

### Output

For each test case, print a single line containing one integer ― the number of groups.

### Constraints

- 1≤T≤501 \leq T \leq 501≤T≤50

- 1≤N≤1051 \leq N \leq 10^51≤N≤105

### Subtasks

**Subtask #1 (100 points):** original constraints

### Sample 1:

Input

Output

```
4
000
010
101
01011011011110
```

```
0
1
2
4
```

### Explanation:

**Example case 1:** Since all seats are empty, the number of groups is 000.

**Example case 2:** Since only one seat is occupied, the number of groups is 111.

**Example case 3:** Here, two seats are occupied, but since they are not adjacent, the people sitting on them belong to different groups.

**Example case 4:** Here, we have 444 groups of friends with size 111, 222, 222 and 444 respectively. That is, first group is sitting at 222nd seat, second group at 444th and 555th seat, third group at  777th and 888th seat and fourth group at 101010th to 131313th seat.
