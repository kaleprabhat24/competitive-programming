# Card Removal Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-05-24 |

---

## Problem Statement

### Card Removal

You have NNN cards placed in front of you on the table. The ithi^{th}ith card has the number AiA_iAi​ written on it.

In one move, you can **remove** any one card from the remaining cards on the table.

Find the **minimum** number of moves required so that all the cards remaining on the table have the **same** number written on them.

### Input Format

- The first line contains a single integer TTT — the number of test cases. Then the test cases follow.

- The first line of each test case contains an integer NNN — the number of cards on the table.

- The second line of each test case contains NNN space-separated integers A1,A2,…,ANA_1, A_2, \dots, A_NA1​,A2​,…,AN​ where AiA_iAi​ is the number written on the ithi^{th}ith card.

### Output Format

For each test case, output the **minimum** number of moves required so that all the cards remaining on the table have the same number written on them.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤N≤1001 \le N \le 1001≤N≤100

- 1≤Ai≤101 \le A_i \le 101≤Ai​≤10

### Sample 1:

Input

Output

```
3
5
1 1 2 2 3
4
8 8 8 8
6
5 6 7 8 9 10

```

```
3
0
5

```

### Explanation:

**Test case 111:** The minimum number of moves required such that all remaining cards have same values is 333:

- Move 111: Remove a card with number 111. Remaining cards are [1,2,2,3][1, 2, 2, 3][1,2,2,3].

- Move 222: Remove a card with number 111. Remaining cards are [2,2,3][2, 2, 3][2,2,3].

- Move 333: Remove a card with number 333. Remaining cards are [2,2][2, 2][2,2].

**Test case 222:** All cards have the same number initially. Thus, no moves are required.

**Test case 333:** The minimum number of moves required such that all remaining cards have same values is 555:

- Move 111: Remove a card with number 555. Remaining cards are [6,7,8,9,10][6, 7, 8, 9, 10][6,7,8,9,10].

- Move 222: Remove a card with number 666. Remaining cards are [7,8,9,10][7, 8, 9, 10][7,8,9,10].

- Move 333: Remove a card with number 777. Remaining cards are [8,9,10][8, 9, 10][8,9,10].

- Move 444: Remove a card with number 888. Remaining cards are [9,10][9, 10][9,10].

- Move 555: Remove a card with number 999. Remaining cards are [10][10][10].
