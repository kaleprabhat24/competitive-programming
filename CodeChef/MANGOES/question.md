# The Mango Truck Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-11-03 |

---

## Problem Statement

### The Mango Truck

You are given that a mango weighs XXX kilograms and a truck weighs YYY kilograms.
You want to cross a bridge that can withstand a weight of ZZZ kilograms.

Find the **maximum** number of mangoes you can load in the truck so that you can cross the bridge safely.

### Input Format

- First line will contain TTT, the number of test cases. Then the test cases follow.

- Each test case consists of a single line of input, three integers X,Y,ZX, Y, ZX,Y,Z - the weight of mango, the weight of truck and the weight the bridge can withstand respectively.

### Output Format

For each test case, output in a single line the **maximum** number of mangoes that you can load in the truck.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤X≤Y≤Z≤1001 \leq X \leq Y \leq Z \leq 1001≤X≤Y≤Z≤100

### Sample 1:

Input

Output

```
4
2 5 11
4 10 20
1 1 1
6 40 90

```

```
3
2
0
8

```

### Explanation:

**Test case 111:** You can load 333 mangoes at maximum. The total weight is 3×2+5=11≤11 3\times 2+5 = 11 \leq 113×2+5=11≤11. Thus, the truck can safely cross the bridge with 333 mangoes. If you load 444 mangoes, the total weight is 4×2+5=13>114\times 2+5 = 13 \gt 114×2+5=13>11.

**Test case 222:** You can load 222 mangoes at maximum. The total weight is 2×4+10=18≤20 2\times 4+10 = 18 \leq 202×4+10=18≤20. Thus, the truck can safely cross the bridge with 222 mangoes.

**Test case 333:** You can load 000 mangoes at maximum. The total weight is 0×1+1=1≤1 0\times 1+1 = 1 \leq 10×1+1=1≤1. Thus, the truck can safely cross the bridge only if there are 000 mangoes.

**Test case 444:** You can load 888 mangoes at maximum. The total weight is 6×8+40=88≤90 6\times 8+40 = 88 \leq 906×8+40=88≤90. Thus, the truck can safely cross the bridge with 888 mangoes.
