# Chef and Chocolates Practice Problem in Basic Math

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-04-10 |

---

## Problem Statement

### Chef and Chocolates

Chef has XXX `5` rupee coins and YYY `10` rupee coins. Chef goes to a shop to buy chocolates for Chefina where each chocolate costs ZZZ rupees. Find the maximum number of chocolates that Chef can buy for Chefina.

### Input Format

- The first line contains a single integer TTT — the number of test cases. Then the test cases follow.

- The first and only line of each test case contains three integers XXX, YYY and ZZZ — the number of `5` rupee coins, the number of `10` rupee coins and the cost of each chocolate.

### Output Format

For each test case, output the maximum number of chocolates that Chef can buy for Chefina.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤X,Y,Z≤10001 \leq X,Y,Z \leq 10001≤X,Y,Z≤1000

### Sample 1:

Input

Output

```
4
10 10 10
3 1 8
8 1 3
4 4 1000
```

```
15
3
16
0

```

### Explanation:

**Test case 111:** Chef has 10⋅5+10⋅10=15010 \cdot 5 + 10 \cdot 10 = 15010⋅5+10⋅10=150 rupees in total. Since each chocolate costs 101010 rupees, Chef can spend all 150150150 rupees and buy 151515 chocolates for Chefina.

**Test case 222:** Chef has 3⋅5+1⋅10=253 \cdot 5 + 1 \cdot 10 = 253⋅5+1⋅10=25 rupees in total. Since each chocolate costs 888 rupees, Chef can buy a maximum of 333 chocolates for Chefina, leaving him with 111 rupee.

**Test case 333:** Chef has 8⋅5+1⋅10=508 \cdot 5 + 1 \cdot 10 = 508⋅5+1⋅10=50 rupees in total. Since each chocolate costs 333 rupees, Chef can buy a maximum of 161616 chocolates for Chefina, leaving him with 222 rupee.

**Test case 444:** Chef has 4⋅5+4⋅10=604 \cdot 5 + 4 \cdot 10 = 604⋅5+4⋅10=60 rupees in total. Since each chocolate costs 100010001000 rupees, Chef can buy no chocolate for Chefina, leaving him with 606060 rupees.
