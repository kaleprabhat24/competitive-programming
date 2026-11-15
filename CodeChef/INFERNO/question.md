# Infernos Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-15 |

---

## Problem Statement

### Infernos

Ved started playing a new mobile game called Fighting Clans. An army of NNN enemies is approaching his base. The ithi^{th}ith enemy has HiH_iHi​ health points. An enemy gets killed if his health points become 000.

Ved defends his base using a weapon named `Inferno`. He can set the `Inferno` to one of the following two modes:

- Single-Target Mode: In one second, the `Inferno` can target **exactly one** living enemy and cause damage of at most XXX health points.

- Multi-Target Mode: In one second, the `Inferno` can target **all** living enemies and cause damage of 111 health point to each of them.

Find the **minimum** time required to kill all the enemies.

**Note:** Ved is **not allowed** to change the mode of the weapon once it is set initially.

### Input Format

- The first line contains a single integer TTT - the number of test cases. Then the test cases follow.

- The first line of each test case contains two integers NNN and XXX - the number of enemies and the damage caused by the single-target mode of `Inferno` in one second respectively.

- The second line of each test case contains NNN space-separated integers H1,H2,…,HNH_1, H_2, \dots, H_NH1​,H2​,…,HN​ where HiH_iHi​ denotes the initial health points of ithi^{th}ith enemy.

### Output Format

For each test case, output in a single line, the **minimum** time required to kill all the enemies.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤N≤2001 \leq N \leq 2001≤N≤200

- 1≤X≤1001 \le X \le 1001≤X≤100

- 1≤Ai≤1001 \le A_i \le 1001≤Ai​≤100

### Sample 1:

Input

Output

```
4
5 4
2 2 4 1 1
3 5
5 4 5
4 4
4 4 4 4
3 10
7 8 9

```

```
4
3
4
3
```

### Explanation:

**Test case 1:** In single-target mode, all enemies can be killed in 111 second each. Thus, in single-target mode, the total time required is 555 seconds.

In multi-target mode:

- After one second, the health points of the enemies are: [1,1,3,0,0][1, 1, 3, 0, 0][1,1,3,0,0]. Enemies 444 and 555 are dead after one second.

- After two seconds, the health points of the enemies are: [0,0,2,0,0][0, 0, 2, 0, 0][0,0,2,0,0].

- After three seconds, the health points of the enemies are: [0,0,1,0,0][0, 0, 1, 0, 0][0,0,1,0,0].

- After four seconds, the health points of the enemies are: [0,0,0,0,0][0, 0, 0, 0, 0][0,0,0,0,0].

Thus, 444 seconds are required to kill enemies using multi-target mode. The minimum time required to kill all the enemies is 444 seconds.

**Test case 2:** In single-target mode, all enemies can be killed in 111 second each. Thus, in single-target mode, the total time required is 333 seconds.

In multi-target mode:

- After one second, the health points of the enemies are: [4,3,4][4, 3, 4][4,3,4].

- After two seconds, the health points of the enemies are: [3,2,3][3, 2, 3][3,2,3].

- After three seconds, the health points of the enemies are: [2,1,2][2, 1, 2][2,1,2].

- After four seconds, the health points of the enemies are: [1,0,1][1, 0, 1][1,0,1].

- After five seconds, the health points of the enemies are: [0,0,0][0, 0, 0][0,0,0].

Thus, 555 seconds are required to kill enemies using multi-target mode. The minimum time required to kill all the enemies is 333 seconds.

**Test case 3:** Here, single-target mode will take 444 seconds and multi-target mode will also take 444 seconds. Therefore, the minimum time required is 444 seconds.

**Test case 4:** Here, single-target mode will take 333 seconds, while multi-target mode will take 999 seconds. Therefore, the minimum time required is 333 seconds.
