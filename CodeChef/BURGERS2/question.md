# Hungry Chef Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-28 |

---

## Problem Statement

### Hungry Chef

Chef is very hungry. So, Chef goes to a shop selling burgers. The shop has 222 types of burgers:

- Normal burgers, which cost XXX rupees each

- Premium burgers, which cost YYY rupees each (where Y>XY \gt XY>X)

Chef has RRR rupees. Chef wants to buy **exactly** NNN burgers. He also wants to maximize the number of premium burgers he buys. Determine the number of burgers of both types Chef must buy.

Output −1-1−1 if it is not possible for Chef to buy NNN burgers.

### Input Format

- The first line contains a single integer TTT — the number of test cases. Then the test cases follow.

- The first and only line of each test case contains four space-separated integers XXX, YYY, NNN and RRR — the cost of a normal burger, the cost of a premium burger, the number of burgers Chef wants to buy and the amount of money Chef has.

### Output Format

For each test case, output on a new line two integers: the number of normal burgers and the number of premium burgers Chef must buy satisfying the given conditions.

Output −1-1−1 if he cannot buy NNN burgers.

### Constraints

- 1≤T≤1041 \leq T \leq 10^41≤T≤104

- 1≤X<Y≤10001 \le X \lt Y \le 10001≤X<Y≤1000

- 1≤N≤1061 \le N \le 10^61≤N≤106

- 1≤R≤1091 \le R \le 10^91≤R≤109

### Sample 1:

Input

Output

```
4
2 10 4 12
4 8 10 50
99 100 5 10
9 10 10 200

```

```
4 0
8 2
-1
0 10

```

### Explanation:

**Test case 111:** Chef has to buy 444 normal burgers only. Even if he buys 111 premium burger, he would not be able to buy 444 burgers.

**Test case 222:** Chef can buy 888 normal burgers and 222 premium burgers.

**Test case 333:** It is not possible for Chef to buy 555 burgers.
