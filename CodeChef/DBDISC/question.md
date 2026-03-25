# Practice Coding Problem

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-03-25 |

---

## Problem Statement

### Double Discount

Chef is craving a midnight snack, and so decided to order some food on the ChefEats app.

There are NNN food items available on the ChefEats app.

The iii-th item has a cost of AiA_iAi​ rupees and a tastiness of BiB_iBi​.

It is guaranteed that each AiA_iAi​ is an even integer.

Chef wants to buy **exactly two** items of food from the app.

ChefEats has a special offer ongoing: when you order two food items, the **more expensive** one receives a discount to its price of either 50%50\%50% or 100100100 rupees, whichever is **smaller**.

For example,

- If the two items have costs of 404040 and 909090, the second item will receive a discount of 50%50\%50% of 909090 which equals 454545; so the total cost is 40+45=8540+45 = 8540+45=85.

- On the other hand, if the two items have costs of 210210210 and 404040, the first item will only receive a discount of 100100100 rupees (because 50%50\%50% of its cost is 105105105 which is more than 100100100); so the total cost is 40+110=15040+110 = 15040+110=150.

Chef does not want to spend more than KKK rupees in total, including the discount.

Your task is to find the **maximum** possible total tastiness of buying two food items, while not exceeding a cost of KKK.

The total tastiness equals the sum of the tastiness values of the two items bought.

If it's not possible to buy two food items without exceeding a cost of KKK, print the integer 000 instead.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of three lines of input.

The first line of each test case contains two space-separated integers NNN and KKK — the number of food items and Chef's budget, respectively.

- The second line contains NNN space-separated integers A1,A2,…,ANA_1, A_2, \ldots, A_NA1​,A2​,…,AN​ — the prices of the food items.

- The third line contains NNN space-separated integers B1,B2,…,BNB_1, B_2, \ldots, B_NB1​,B2​,…,BN​ — the tastiness values of the food items.

### Output Format

For each test case,

- If it's not possible to buy two items with a budget of KKK, print the integer 000.

- Otherwise, print the maximum possible total tastiness of buying two items within a budget of KKK.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 2≤N≤1002 \leq N \leq 1002≤N≤100

- 2≤Ai≤4002 \le A_i \le 4002≤Ai​≤400

- 1≤Bi,K≤4001 \le B_i, K \le 4001≤Bi​,K≤400

- AiA_iAi​ is even for each 1≤i≤N1 \le i \le N1≤i≤N

### Sample 1:

Input

Output

```
4
3 16
10 8 14
5 2 12
3 20
10 8 14
5 2 12
5 230
230 102 98 308 250
231 123 211 120 345
4 100
90 120 60 150
10 45 19 78

```

```
14
17
442
0
```

### Explanation:

**Test case 111:** There are three possible ways to buy two items.

- Buy the first and second items.

The more expensive item has a cost of 101010, and will receive a discount of 50%50\%50% which is 555.

- So, the overall cost comes out to be 5+8=135+8 = 135+8=13, while the tastiness is 5+2=75+2=75+2=7.

- Buy the first and third items.

The more expensive item has a cost of 141414, and will receive a discount of 50%50\%50% which is 777.

- So, the overall cost comes out to be 10+7=1710+7 = 1710+7=17, while the tastiness is 5+12=175+12=175+12=17.

- Buy the second and third items.

The more expensive item has a cost of 141414, and will receive a discount of 50%50\%50% which is 777.

- So, the overall cost comes out to be 8+7=158+7 = 158+7=15, while the tastiness is 2+12=142+12=142+12=14.

With a budget of 161616, the optimal choice is the third option (buying the second and third item).

So, the maximum possible tastiness equals 141414.

**Test case 222:** The same as the first test, but with a higher budget of 202020 now.

All three options are viable, so this time the optimal choice is to buy the first and third items for a total tastiness of 171717.

**Test case 333:** The optimal choice is to buy the first and third items, for a cost of (230−100)+98=228(230-100) + 98 = 228(230−100)+98=228 which fits in the budget of 230230230.

The total tastiness is 231+211=442231+211 = 442231+211=442.

**Test case 444:** It's impossible to buy two items while staying within the budget, so we output 000.
