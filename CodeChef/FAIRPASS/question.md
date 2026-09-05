# Passes for Fair Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-09-05 |

---

## Problem Statement

### Passes for Fair

There is a fair going on in Chefland. Chef wants to visit the fair along with his NNN friends. Chef manages to collect KKK passes for the fair. Will Chef be able to enter the fair with all his NNN friends?

A person can enter the fair using one pass, and each pass can be used by only one person.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of a single line containing two space-separated integers N,KN, KN,K.

### Output Format

For each test case, print on a new line `YES` if Chef will be able to enter the fair with all his NNN friends and `NO` otherwise.

You may print each character of the string in either uppercase or lowercase (for example, the strings `yEs`, `yes`, `Yes`, and `YES` will all be treated as identical).

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤N,K≤1001 \leq N, K \leq 1001≤N,K≤100

### Sample 1:

Input

Output

```
4
5 8
6 3
2 2
1 2

```

```
YES
NO
NO
YES

```

### Explanation:

**Test case 111:** Chef needs 555 passes for his friends and one pass for himself and he collected 888 passes. Thus he will be able to enter the fair with all his friends.

**Test case 222:** Chef needs 666 passes for his friends and one pass for himself while he collected only 333 passes. Thus he will not be able to enter the fair with all his friends, only three of them can enter the fair.

**Test case 333:** Chef needs 222 passes for his friends and one pass for himself while he collected only 222 passes. Thus either Chef or one of his friends can't enter the fair.

**Test case 444:** Chef needs a total of 222 passes, one for himself and one for his friend. He collected 222 passes. Thus he will be able to enter the fair with his friend.
