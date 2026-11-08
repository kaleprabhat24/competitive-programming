# Dominant Army Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-08 |

---

## Problem Statement

### Dominant Army

In the medieval age, there were 333 kingdoms AAA, BBB, and CCC. The army of these kingdom had NAN_ANA​, NBN_BNB​, and NCN_CNC​ soldiers respectively.

You are given that an army with XXX soldiers can defeat an army with YYY soldiers only if X>YX \gt YX>Y.

An army is said to be **dominant** if it can defeat both the other armies **combined**. For example, kingdom CCC's army will be dominant only if NC>NA+NBN_C > N_A + N_BNC​>NA​+NB​.

Determine whether any of the armies is **dominant** or not.

### Input Format

- The first line contains a single integer TTT - the number of test cases. Then the test cases follow.

- The first and only line of each test case contains three integers NAN_ANA​, NBN_BNB​, and NCN_CNC​ - the number of warriors in the armies of kingdoms AAA, BBB, and CCC respectively.

### Output Format

For each test case, output `YES` if any of the armies is dominant. Otherwise, output `NO`.

You may print each character of `YES` and `NO` in uppercase or lowercase (for example, `yes`, `yEs`, `Yes` will be considered identical).

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤NA,NB,NC≤1001 \leq N_A, N_B, N_C \leq 1001≤NA​,NB​,NC​≤100

### Sample 1:

Input

Output

```
4
15 5 6
12 13 16
1 1 100
10 10 20

```

```
YES
NO
YES
NO

```

### Explanation:

**Test case 111:** The kingdom AAA's army is dominant since 15>5+615 > 5 + 615>5+6.

**Test case 222:** We can observe that none of the armies is dominant.

**Test case 333:** The kingdom CCC's army is dominant since 100>1+1100 > 1 + 1100>1+1.

**Test case 444:** We can observe that none of the armies is dominant. Note that the kingdom CCC's army is not dominant since 20≤10+1020 \le 10 + 1020≤10+10.
