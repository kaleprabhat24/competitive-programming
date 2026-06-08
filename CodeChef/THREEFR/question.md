# Three Friends Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-08 |

---

## Problem Statement

### Three Friends

There are three friends; let's call them A, B, C. They made the following statements:

- A: "I have xxx Rupees more than B."

- B: "I have yyy rupees more than C."

- C: "I have zzz rupees more than A."

You do not know the exact values of x,y,zx, y, zx,y,z. Instead, you are given their absolute values, i.e. X=∣x∣X = |x|X=∣x∣, Y=∣y∣Y = |y|Y=∣y∣ and Z=∣z∣Z = |z|Z=∣z∣. Note that xxx, yyy, zzz may be negative; "having −r-r−r rupees more" is the same as "having rrr rupees less".

Find out if there is some way to assign amounts of money to A, B, C such that all of their statements are true.

### Input

- The first line of the input contains a single integer TTT denoting the number of test cases. The description of TTT test cases follows.

- The first and only line of each test case contains three space-separated integers XXX, YYY and ZZZ.

### Output

For each test case, print a single line containing the string `"yes"` if the presented scenario is possible or `"no"` otherwise (without quotes).

### Constraints

- 1≤T≤1,0001 \le T \le 1,0001≤T≤1,000

- 1≤X,Y,Z≤1,0001 \le X, Y, Z \le 1,0001≤X,Y,Z≤1,000

### Subtasks

**Subtask #1 (30 points):**

- 1≤T≤301 \le T \le 301≤T≤30

- 1≤X,Y,Z≤31 \le X, Y, Z \le 31≤X,Y,Z≤3

**Subtask #2 (70 points):** original constraints

### Sample 1:

Input

Output

```
2
1 2 1
1 1 1
```

```
yes
no
```

### Explanation:

**Example 1**: One possible way to satisfy all conditions is: A has 101010 rupees, B has 999 rupees and C has 111111 rupees. Therefore, we have x=1x = 1x=1, y=−2y = -2y=−2, z=1z = 1z=1.

**Example 2**: There is no way for all conditions to be satisfied.
