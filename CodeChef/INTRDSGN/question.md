# Interior Design Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-09-17 |

---

## Problem Statement

### Interior Design

Chef decided to redecorate his house, and now needs to decide between two different styles of interior design.

For the first style, tiling the floor will cost X1X_1X1​ rupees and painting the walls will cost Y1Y_1Y1​ rupees.

For the second style, tiling the floor will cost X2X_2X2​ rupees and painting the walls will cost Y2Y_2Y2​ rupees.

Chef will choose whichever style has the lower total cost. How much will Chef pay for his interior design?

### Input Format

- The first line of input will contain a single integer TTT, denoting the number of test cases.

- Each test case consists of a single line of input, containing 444 space-separated integers X1,Y1,X2,Y2X_1, Y_1, X_2, Y_2X1​,Y1​,X2​,Y2​ as described in the statement.

### Output Format

For each test case, output on a new line the amount Chef will pay for interior design.

### Constraints

- 1≤T≤1001 \leq T \leq 1001≤T≤100

- 1≤X1,Y1,X2,Y2≤1001 \leq X_1, Y_1, X_2, Y_2 \leq 1001≤X1​,Y1​,X2​,Y2​≤100

### Sample 1:

Input

Output

```
4
10 20 9 25
10 20 9 20
10 20 20 10
100 43 85 61

```

```
30
29
30
143
```

### Explanation:

**Test case 111:** The first style costs 10+20=3010 + 20 = 3010+20=30 rupees, and the second costs 9+25=349 + 25 = 349+25=34 rupees. The first is cheaper, so Chef will pay 303030 rupees.

**Test case 222:** The first style costs 10+20=3010 + 20 = 3010+20=30 rupees, and the second costs 9+20=299 + 20 = 299+20=29 rupees. The second is cheaper, so Chef will pay 292929 rupees.

**Test case 333:** The first style costs 10+20=3010 + 20 = 3010+20=30 rupees, and the second costs 20+10=3020 + 10 = 3020+10=30 rupees. Both styles cost the same, so Chef is always going to pay 303030 rupees.

**Test case 444:** The first style costs 100+43=143100 + 43 = 143100+43=143 rupees, and the second costs 85+61=14685 + 61 = 14685+61=146 rupees. The first is cheaper, so Chef will pay 143143143 rupees.
