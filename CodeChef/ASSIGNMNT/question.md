# Pending Assignments Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-10-27 |

---

## Problem Statement

### Pending Assignments

Chef has finally decided to complete all of his pending assignments.

There are XXX assignments where each assignment takes YYY **minutes** to complete.

Find whether Chef would be able to complete all the assignments in ZZZ **days**.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists three space-separated integers X,Y,X, Y,X,Y, and ZZZ — the number of assignments, time taken in minutes to complete each assignment, and the number of days in which Chef wants to complete the assignments.

### Output Format

For each test case, output on a new line, `YES`, if Chef would be able to complete all the assignments in ZZZ **days**. Otherwise, print `NO`.

You may print each character of the string in uppercase or lowercase (for example, the strings `YES`, `yEs`, `yes`, and `yeS` will all be treated as identical).

### Constraints

- 1≤T≤1051 \leq T \leq 10^51≤T≤105

- 1≤X,Y≤1001 \leq X, Y \leq 1001≤X,Y≤100

- 1≤Z≤101 \leq Z \leq 101≤Z≤10

### Sample 1:

Input

Output

```
3
5 5 5
50 80 2
20 72 1

```

```
YES
NO
YES
```

### Explanation:

**Test case 111:** Chef needs a total of 5⋅5=255\cdot 5 = 255⋅5=25 minutes to complete all the assignments. Thus, he would be able to complete the assignments in 555 days.

**Test case 222:** Chef needs a total of 50⋅80=400050\cdot 80 = 400050⋅80=4000 minutes to complete all the assignments. However, in 222 days, he only has 2⋅24⋅60=28802\cdot 24\cdot 60 = 28802⋅24⋅60=2880 minutes.

Thus, he would not be able to complete the assignments in 222 days.

**Test case 333:** Chef needs a total of 20⋅72=144020\cdot 72 = 144020⋅72=1440 minutes to complete all the assignments. In 111 days, he has 24⋅60=144024\cdot 60 = 144024⋅60=1440 minutes.

Thus, he would be able to complete the assignments in 111 day.
