# Practice Coding Problem

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-04-01 |

---

## Problem Statement

### Moderate Temperatures

Chef has just been in Chefland for NNN days, and measured the temperature each day. The iii-th day had a temperature of AiA_iAi​.

Chef enjoys moderate climates, and dislikes extremes. Therefore, he likes all the days that **did not** have the maximum or minimum temperatures among the NNN days.

How many days did Chef like?

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of multiple lines of input.

The first line contains a single integer NNN - the number of days.

- The second line contains NNN integers - A1,A2,…,ANA_1, A_2, \ldots, A_NA1​,A2​,…,AN​.

### Output Format

For each test case, output the number of days Chef liked.

### Constraints

- 1≤T≤1001 \le T \le 1001≤T≤100

- 1≤N≤1001 \le N \le 1001≤N≤100

- 1≤Ai≤1001 \le A_i \le 1001≤Ai​≤100

### Sample 1:

Input

Output

```
4
5
1 2 3 4 5
4
1 1 2 2
5
9 9 1 3 1
3
5 5 5

```

```
3
0
1
0
```

### Explanation:

**Test Case 1** : The maximum temperature is 555, and the minimum is 111. Hence, Chef likes days 222, 333 and 444; as those do not have the maximum or minimum.

**Test Case 2** : The maximum is 222, and the minimum is 111; so Chef does not like any day.
