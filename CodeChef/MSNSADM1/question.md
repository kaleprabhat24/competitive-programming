# Football Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-21 |

---

## Problem Statement

### Football

A football competition has just finished. The players have been given points for scoring goals and points for committing fouls. Now, it is up to Alex to find the best player in the tournament. As a programmer, your job is to help Alex by telling him the highest number of points achieved by some player.

You are given two sequences A1,A2,…,ANA_1, A_2, \ldots, A_NA1​,A2​,…,AN​ and B1,B2,…,BNB_1, B_2, \ldots, B_NB1​,B2​,…,BN​. For each valid iii, player iii scored AiA_iAi​ goals and committed BiB_iBi​ fouls. For each goal, the player that scored it gets 202020 points, and for each foul, 101010 points are deducted from the player that committed it. However, if the resulting number of points of some player is negative, this player will be considered to have 000 points instead.

You need to calculate the total number of points gained by each player and tell Alex the maximum of these values.

### Input

- The first line of the input contains a single integer TTT denoting the number of test cases. The description of TTT test cases follows.

- The first line of each test case contains a single integer NNN.

- The second line contains NNN space-separated integers A1,A2,…,ANA_1, A_2, \ldots, A_NA1​,A2​,…,AN​.

- The third line contains NNN space-separated integers B1,B2,…,BNB_1, B_2, \ldots, B_NB1​,B2​,…,BN​.

### Output

For each test case, print a single line containing one integer ― the maximum number of points.

### Constraints

- 1≤T≤1001 \le T \le 1001≤T≤100

- 1≤N≤1501 \le N \le 1501≤N≤150

- 0≤Ai≤500 \le A_i \le 500≤Ai​≤50 for each valid iii

- 0≤Bi≤500 \le B_i \le 500≤Bi​≤50 for each valid iii

### Subtasks

**Subtask #1 (30 points):** 1≤N≤21 \le N \le 21≤N≤2

**Subtask #2 (70 points):** original constraints

### Sample 1:

Input

Output

```
2
3
40 30 50
2 4 20
1
0
10
```

```
800
0
```

### Explanation:

**Example case 1:** The first player gets 800800800 points for scoring goals and has 202020 points deducted for fouls. Likewise, the second player gets 560560560 points and the third player gets 800800800 points. The third player is the one with the maximum number of points.
