# Reach the Target Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-08-06 |

---

## Problem Statement

### Reach the Target

There is a cricket match going on between two teams AAA and BBB.

Team BBB is batting second and got a target of XXX runs. Currently, team BBB has scored YYY runs. Determine how many more runs Team BBB should score to **win** the match.

**Note: The `target score` in cricket matches is one more than the number of runs scored by the team that batted first**.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of two space-separated integers XXX and YYY, the target for team BBB and the current score of team BBB respectively.

### Output Format

For each test case, output how many more runs team BBB should score to win the match.

### Constraints

- 1≤T≤101 \leq T \leq 101≤T≤10

- 50≤Y<X≤20050 \leq Y \lt X \leq 20050≤Y<X≤200

### Sample 1:

Input

Output

```
4
200 50
100 99
130 97
53 51

```

```
150
1
33
2

```

### Explanation:

**Test case 111:** The target is 200200200 runs and team BBB has already made 505050 runs. Thus, the team needs to make 200−50=150200-50 = 150200−50=150 runs more, to win the match.

**Test case 222:** The target is 100100100 runs and team BBB has already made 999999 runs. Thus, the team needs to make 100−99=1100-99 = 1100−99=1 runs more, to win the match.

**Test case 333:** The target is 130130130 runs and team BBB has already made 979797 runs. Thus, the team needs to make 130−97=33130-97 = 33130−97=33 runs more, to win the match.

**Test case 444:** The target is 535353 runs and team BBB has already made 515151 runs. Thus, the team needs to make 53−51=253-51= 253−51=2 runs more, to win the match.
