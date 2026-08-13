# Total Prize Money Practice Problem in 500 difficulty rating

| Field | Value |
|-------|-------|
| **Platform** | CodeChef |
| **Language** | java |
| **Solved On** | 2026-08-13 |

---

## Problem Statement

### Total Prize Money

In a coding contest, there are prizes for the top rankers. The prize scheme is as follows:

- Top 101010 participants receive rupees XXX each.

- Participants with rank 111111 to 100100100 (both inclusive) receive rupees YYY each.

Find the total prize money over all the contestants.

### Input Format

- First line will contain TTT, number of test cases. Then the test cases follow.

- Each test case contains of a single line of input, two integers XXX and YYY - the prize for top 101010 rankers and the prize for ranks 111111 to 100100100 respectively.

### Output Format

For each test case, output the total prize money over all the contestants.

### Constraints

- 1≤T≤10001 \leq T \leq 10001≤T≤1000

- 1≤Y≤X≤10001 \leq Y \leq X \leq 10001≤Y≤X≤1000

### Sample 1:

Input

Output

```
4
1000 100
1000 1000
80 1
400 30

```

```
19000
100000
890
6700

```

### Explanation:

**Test Case 111:** Top 101010 participants receive rupees 100010001000 and next 909090 participants receive rupees 100100100 each. So, total prize money =10⋅1000+90⋅100=19000= 10 \cdot 1000 + 90 \cdot 100 = 19000=10⋅1000+90⋅100=19000.

**Test Case 222:** Top 101010 participants receive rupees 100010001000 and next 909090 participants receive rupees 100010001000 each. So, total prize money =10⋅1000+90⋅1000=100000= 10 \cdot 1000 + 90 \cdot 1000 = 100000=10⋅1000+90⋅1000=100000.

**Test Case 333:** Top 101010 participants receive rupees 808080 and next 909090 participants receive rupee 111 each. So, total prize money =10⋅80+90⋅1=890= 10 \cdot 80 + 90 \cdot 1 = 890=10⋅80+90⋅1=890.

**Test Case 444:** Top 101010 participants receive rupees 400400400 and next 909090 participants receive rupees 303030 each. So, total prize money =10⋅400+90⋅30=6700= 10 \cdot 400 + 90 \cdot 30 = 6700=10⋅400+90⋅30=6700.
