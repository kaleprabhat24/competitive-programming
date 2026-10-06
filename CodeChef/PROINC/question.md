# Profit Increment Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-10-06 |

---

## Problem Statement

### Profit Increment

Chef recently started selling a special fruit.

He has been selling the fruit for XXX rupees (XXX is a multiple of 100100100). He earns a profit of YYY rupees on selling the fruit currently.

Chef decided to increase the selling price by 10%10\%10%. Please help him calculate his new profit after the increase in selling price.

Note that only the selling price has been increased and the buying price is same.

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of a single line of input containing two space-separated integers XXX and YYY denoting the initial selling price and the profit respectively.

### Output Format

For each test case, output a single integer, denoting the new profit.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤X≤10001 \leq X \leq 10001≤X≤1000

- 1≤Y≤1001 \leq Y \leq 1001≤Y≤100

- XXX is a multiple of 100100100.

### Sample 1:

Input

Output

```
4
100 10
200 5
500 10
100 7

```

```
20
25
60
17

```

### Explanation:

**Test case 111:** The buying price of the item is the difference of selling price and profit, which is 909090. The new selling price is 10%10\%10% more than the initial selling price. Thus, the new profit is 110−90=20110-90 = 20110−90=20.

**Test case 222:** The buying price of the item is the difference of selling price and profit, which is 195195195. The new selling price is 10%10\%10% more than the initial selling price. Thus, the new profit is 220−195=25220-195 = 25220−195=25.

**Test case 333:** The buying price of the item is the difference of selling price and profit, which is 490490490. The new selling price is 10%10\%10% more than the initial selling price. Thus, the new profit is 550−490=60550-490 = 60550−490=60.

**Test case 444:** The buying price of the item is the difference of selling price and profit, which is 939393. The new selling price is 10%10\%10% more than the initial selling price. Thus, the new profit is 110−93=17110-93 = 17110−93=17.
