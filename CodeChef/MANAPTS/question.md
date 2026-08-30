# Mana Points Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-08-30 |

---

## Problem Statement

### Mana Points

Chef is playing a mobile game. In the game, Chef's character *Chefario* can perform special attacks. However, one special attack costs XXX mana points to Chefario.

If Chefario currently has YYY mana points, determine the **maximum** number of special attacks he can perform.

### Input Format

- The first line contains a single integer TTT — the number of test cases. Then the test cases follow.

- The first and only line of each test case contains two space-separated integers XXX and YYY — the cost of one special attack and the number of mana points Chefario has initially.

### Output Format

For each test case, output the maximum number of special attacks Chefario can perform.

### Constraints

- 1≤T≤1051 \leq T \leq 10^51≤T≤105

- 1≤X≤1001 \le X \le 1001≤X≤100

- 1≤Y≤10001 \le Y \le 10001≤Y≤1000

### Sample 1:

Input

Output

```
3
10 30
6 41
50 2

```

```
3
6
0

```

### Explanation:

**Test case 111:** Chefario can perform a maximum of 333 special attacks which will cost him 303030 mana points.

**Test case 222:** Chefario can perform a maximum of 666 special attacks which will cost him 363636 mana points. Note that Chefario can not perform 777 special attacks as these will cost him 424242 mana points while he has only 414141 mana points.

**Test case 333:** Chefario will not be able to perform any special attacks in this case.
