# That Is My Score! Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-16 |

---

## Problem Statement

### That Is My Score!

You are participating in a contest which has 111111 problems (numbered 111 through 111111). The first eight problems (i.e. problems 1,2,…,81, 2, \ldots, 81,2,…,8) are *scorable*, while the last three problems (999, 101010 and 111111) are *non-scorable* ― this means that any submissions you make on any of these problems do not affect your total score.

Your total score is the sum of your best scores for all scorable problems. That is, for each scorable problem, you look at the scores of all submissions you made on that problem and take the maximum of these scores (or 000 if you didn't make any submissions on that problem); the total score is the sum of the maximum scores you took.

You know the results of all submissions you made. Calculate your total score.

### Input

- The first line of the input contains a single integer TTT denoting the number of test cases. The description of TTT test cases follows.

- The first line of each test case contains a single integer NNN denoting the number of submissions you made.

- NNN lines follow. For each iii (1≤i≤N1 \le i \le N1≤i≤N), the iii-th of these lines contains two space-separated integers pip_ipi​ and sis_isi​, denoting that your iii-th submission was on problem pip_ipi​ and it received a score sis_isi​.

### Output

For each test case, print a single line containing one integer ― your total score.

### Constraints

- 1≤T≤101 \le T \le 101≤T≤10

- 1≤N≤1,0001 \le N \le 1,0001≤N≤1,000

- 1≤pi≤111 \le p_i \le 111≤pi​≤11 for each valid iii

- 0≤si≤1000 \le s_i \le 1000≤si​≤100 for each valid iii

### Subtasks

**Subtask #1 (15 points):** all submissions are on the same problem, i.e. p1=p2=…=pNp_1 = p_2 = \ldots = p_Np1​=p2​=…=pN​

**Subtask #2 (15 points):** there is at most one submission made on each problem, i.e. pi≠pjp_i \neq p_jpi​=pj​ for each valid i,ji, ji,j (i≠ji \neq ji=j)

**Subtask #3 (70 points):** original constraints

### Sample 1:

Input

Output

```
2
5
2 45
9 100
8 0
2 15
8 90
1
11 1
```

```
135
0
```

### Explanation:

**Example case 1:** The scorable problems with at least one submission are problems 222 and 888. For problem 222, there are two submissions and the maximum score among them is 454545. For problem 888, there are also two submissions and the maximum score is 909090. Hence, the total score is 45+90=13545 + 90 = 13545+90=135.

**Example case 2:** No scorable problem is attempted, so the total score is 000.
