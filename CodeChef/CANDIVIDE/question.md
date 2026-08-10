# Candy Division Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-08-10 |

---

## Problem Statement

### Candy Division

There are **three** friends and a total of NNN candies.

There will be a fight amongst the friends if all of them do **not** get the same number of candies.

Chef wants to divide **all** the candies such that there is **no fight**. Find whether such distribution is possible.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of a single integer NNN - the number of candies.

### Output Format

For each test case, output `YES`, if we can distribute all the candies between the three friends equally. Otherwise output `NO`.

You can output each character of the answer in uppercase or lowercase. For example, the strings `yEs`, `yes`, `Yes`, and YES are considered the same.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤N≤1001 \leq N \leq 1001≤N≤100

### Sample 1:

Input

Output

```
4
3
4
2
6

```

```
YES
NO
NO
YES
```

### Explanation:

**Test case 111:** Chef can distribute all 333 candies such that each friend gets 111 candy. Since all three friends have same number of candies, there is no fight.

**Test case 222:** There exist no way of distributing **all** candies such that all three friends have same number of candies.

**Test case 333:** There exist no way of distributing **all** candies such that all three friends have same number of candies.

**Test case 444:** Chef can distribute all 666 candies such that each friend gets 222 candies. Since all three friends have same number of candies, there is no fight.
