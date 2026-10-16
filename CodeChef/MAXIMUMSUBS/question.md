# Maximum Submissions Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-10-16 |

---

## Problem Statement

### Maximum Submissions

A participant can make 111 submission every 303030 seconds. If a contest lasts for XXX minutes, what is the maximum number of submissions that the participant can make during it?

It is also given that the participant cannot make any submission in the last 555 seconds of the contest.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of a single integer XXX, denoting the number of minutes.

### Output Format

For each test case, output the maximum number of submissions a participant can make in XXX minutes.

### Constraints

- 1≤T≤301 \leq T \leq 301≤T≤30

- 1≤X≤301 \leq X \leq 301≤X≤30

### Sample 1:

Input

Output

```
4
1
2
3
4

```

```
2
4
6
8

```

### Explanation:

**Test case 111:** The contest lasts for 111 minute, which is 606060 seconds. A participant can make 222 submissions during this time — for example, in the 555-th second and in the 484848-th second. Making 333 or more submissions is impossible.

**Test case 222:** The contest lasts for 222 minutes, which is 120120120 seconds. A participant can make 444 submissions during this time.
