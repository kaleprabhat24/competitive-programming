# Laptop Recommendation Practice Problem in 1000 to 1400 difficulty problems

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-06-24 |

---

## Problem Statement

### Laptop Recommendation 

Chef wants to buy a new laptop. However, he is confused about which laptop to buy out of 101010 different laptops. He asks his NNN friends for their recommendation. The ithi^{th}ith friend recommends the Chef to buy the Aith{A_i}^{th}Ai​th laptop (1≤Ai≤10)(1 \le A_i \le 10)(1≤Ai​≤10).

Chef will buy the laptop which is recommended by **maximum** number of friends. Determine which laptop Chef buys.

Print `CONFUSED` if there are multiple laptops having maximum number of recommendations.

### Input Format

- The first line contains a single integer TTT - the number of test cases. Then the test cases follow.

- The first line of each test case contains an integer NNN - the number of Chef's friends.

- The second line of each test case contains NNN space-separated integers A1,A2,…,ANA_1, A_2, \dots, A_NA1​,A2​,…,AN​ where AiA_iAi​ denotes the recommendation of the ithi^{th}ith friend.

### Output Format

For each test case, output in a single line, the laptop which has the **maximum** number of recommendations. Print `CONFUSED` if there are multiple laptops having maximum number of recommendations.

You may print each character of `CONFUSED` in uppercase or lowercase (for example, `Confused`, `coNFused`, `CONFused` will be considered identical).

### Constraints

- 1≤T≤2001 \leq T \leq 2001≤T≤200

- 1≤N≤10001 \leq N \leq 10001≤N≤1000

- 1≤Ai≤101 \le A_i \le 101≤Ai​≤10

### Sample 1:

Input

Output

```
4
5
4 4 4 2 1
7
1 2 3 4 5 6 6
6
2 2 3 3 10 8
4
7 7 8 8

```

```
4
6
CONFUSED
CONFUSED

```

### Explanation:

**Test case 1:** Laptop 444 has the maximum number of recommendations. Therefore, Chef will buy the 4th4^{th}4th laptop.

**Test case 2:** Laptop 666 has the maximum number of recommendations. Therefore, Chef will buy the 6th6^{th}6th laptop.

**Test case 3:** Laptops 222, 333 have the maximum number of recommendations. Therefore, Chef will still be `CONFUSED`.

**Test case 4:** Laptops 777, 888 have the maximum number of recommendations. Therefore, Chef will still be `CONFUSED`.
